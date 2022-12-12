package com.Saleem.Exceptions;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int x=sc.nextInt();
			System.out.println("Enter the denominator");
			int y=sc.nextInt();
			System.out.println("Performing the operations.");
			int z=x/y;
			System.out.println("Result is :"+z);
		}
		
		catch(Exception e)
		{
			System.out.println("Handled exception");
		}
		finally
		{
			System.out.println("Resource closing.");
		}


	}

}
