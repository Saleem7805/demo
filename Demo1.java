package com.Saleem.Exceptions;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Connection established.");
		try {
			System.out.println("Enter the numerator");
			int x=sc.nextInt();
			System.out.println("Enter the denominator");
			int y=sc.nextInt();
			System.out.println("Performing division operation.");
			int z=x/y;
			System.out.println("The result is :"+z);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Divide by zero error.");
		}
		catch(Exception a)
		{
			System.out.println("Parent type exception.");
		}


	}

}
