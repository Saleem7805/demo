package com.ineuron;

import java.util.Scanner;

public class DemoJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int [][]ar=new int[3][];
		ar[0]=new int[3];
		ar[1]=new int[4];
		ar[2]=new int[2];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter marks of class "+i+ "student"+j);
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The marks of students are");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] +" ");
			}
			System.out.println();
		}
		


	}

}
