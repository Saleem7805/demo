package com.ArrayConcept.Array;

import java.util.Arrays;

// Program to evaluate smallest and largest in an array.
public class LargestInArray {
	public static int getLargest(int a[],int total)
	{
		Arrays.sort(a);
		return a[total-1];
	}
	public static int getSmallest(int a[],int total)
	{
		Arrays.sort(a);
		return a[0];
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,89,5,8};
		System.out.println("Largest is "+getLargest(a,7));
		System.out.println("Smallest is "+getSmallest(a,7));

	}

}
