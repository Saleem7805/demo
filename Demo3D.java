package com.ineuron;

import java.util.Scanner;

public class Demo3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int [][] []ar=new int[3][4][2];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.println("Enter marks of college "+i+ "class"+j +"student" +k);
					ar[i][j][k]=sc.nextInt();
				}
				
			}
		}
		
		System.out.println("The marks of students are");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.print(ar[i][j][k]+" ");
					
				}
				System.out.println();
			}
			
		}
		
			System.out.println();
		}
		


	}


