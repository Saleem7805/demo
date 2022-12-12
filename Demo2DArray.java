package com.ArrayConcept.Array;

import java.util.Scanner;

public class Demo2DArray {
static int i;
static int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr=new int[12];
		
		for(int i=0;i<=2;i++)
		{
			System.out.println("ENTER THE AMOUNT AVAILABLE IN BANK "+arr[i]);
			for(int x=0;x<=4;x++)
			{
				
				arr[x]=sc.nextInt();
				//System.out.println("");
			}
			System.out.println("ENTER THE AMOUNT AVAILABLE OF CUSTOMER "+arr[x]);
		}
		System.out.println("---------------------------------");
		for(int i=0;i<=2;i++)
		{
			//System.out.println("ENTER THE AMOUNT AVAILABLE IN BANK "+arr[i]);
			for(int x=0;x<=4;x++)
			{
				//System.out.println("ENTER THE AMOUNT AVAILABLE OF CUSTOMER "+arr[x]);
				//arr[x]=sc.nextInt();
				//System.out.println("");
				System.out.println("The entered amoount is "+arr[x]);
			}
			
		}
		

	}

}
