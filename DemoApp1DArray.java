package com.ArrayConcept.Array;

import java.util.Scanner;

public class DemoApp1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//More optimized code.
		Scanner sc=new Scanner(System.in);
		int []arr=new int[10];
		System.out.println("Enter the marks of 10 students");
		for(int i=0;i<9;i++)
		{
			arr[i]=sc.nextInt();
			System.out.println("Marks entered for "+" "+"student ");
		}
		System.out.println("-------------------------------");
		System.out.println("Fetching the data");
		for(int i=0;i<9;i++)
		{
			System.out.println("The entered value is "+arr[i]);
		}
		
		

	}

}
