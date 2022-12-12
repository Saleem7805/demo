package com.Saleem.Exceptions;
// User Defined Exception Handling.
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Connection started");
		try {
		System.out.println("Enter the numerator");
		int x=sc.nextInt();
		System.out.println("Enter the denominator");
		int y=sc.nextInt();
		System.out.println("Performing");
			int z=x/y;
			System.out.println("The result is :"+z);
		}
		catch(Exception e)
		{

			System.out.println("Exception handled.");

			System.out.println("Connection terminated");
			
		}
		
		

	}

}
