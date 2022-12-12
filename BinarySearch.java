package com.ineuron;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,80};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		int low=0;
		int high=a.length-1;
		
		while(low<=high)
		{
			int mid=(low + high)/2;
			if(key==a[mid])
			{
				System.out.println("Key "+key+ " Found at index "+ mid);
				break;
			}	
			else if(key <a[mid])
			{
				high=mid-1;
			}
			else if(key >a[mid])
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("Key not found. Please try again!");
		}


	}

}
