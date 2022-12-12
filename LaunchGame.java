package com.ineuron;
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number between 1 to 10");
		guessNum=sc.nextInt();
		boolean flag=false;
		if(guessNum>0 && guessNum <=10)
		{
			System.out.println("VALID NUMBER CHOSEN");
			flag=true;
			
			
		}
		if(flag==false)
		{
			System.out.println("Out of range.");
			System.exit(0);
		}
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		// ADDING "I CAN" PRINTING MESSAGE AFTER GAME LOST TRY AGAIN 
			//to motivate the played 
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i==0 ||j==2 || i==n-1) // I printing
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || i==n-1 ) //C printing
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) // A printing
			{
				if(j==0 || i==0 || i==n/2 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			
		
			for(int j=0;j<n;j++) //N printing
			{
				if(j==0 || j==n-1 ||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println(" ");
		}

		}
		
	}
	
}
public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();


	}

}
