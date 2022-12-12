package com.ineuron;

import java.util.Scanner;

public class Demo1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks of 10 students");
		int x[]=new int[10];
		for(int i=0;i<=9;i++)
		{
			x[i]=sc.nextInt();
			
		}
		System.out.println("Fetching the data of 10 students.");
		for(int i=0;i<=9;i++)
		{
			System.out.println("The student  "+i+ " marks is "+x[i]);
			
		}
		

	}

}
