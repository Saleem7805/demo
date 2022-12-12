package com.ArrayConcept.Array;

import java.util.Arrays;

public class SecondLargestInArray {
	public static int getLargest(int a[],int total)
	{
		Arrays.sort(a);
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,89,5,8};
		System.out.println("Largest is "+getLargest(a,7));
		System.out.println("Array sorting"+Arrays.toString(a));
		
	}
	
}
