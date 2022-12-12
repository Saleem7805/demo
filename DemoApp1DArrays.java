package com.ArrayConcept.Array;

import java.util.Scanner;
public class DemoApp1DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the marks of student of 1 st student");
		a[0]=sc.nextInt();
		System.out.println("Enter the marks of student of 2 nd  student");
		a[1]=sc.nextInt();
		System.out.println("Enter the marks of student of 3 rd  student");
		a[2]=sc.nextInt();
		System.out.println("Enter the marks of student of 4 th student");
		a[3]=sc.nextInt();
		System.out.println("Enter the marks of student of 5 th student");
		a[4]=sc.nextInt();
		System.out.println("-----------------------------------------");
		System.out.println("The marks are as follows:");
		for(int i=0;i<=4;i++)
		{
			System.out.println("The marks are "+a[i]);
		}
		

	}

}
