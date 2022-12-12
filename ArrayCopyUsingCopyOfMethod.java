package com.ArrayConcept.Array;

import java.util.Arrays;

public class ArrayCopyUsingCopyOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []org=new int[] {1,2,3};
		System.out.println("Original Array");
		for(int i=0;i<org.length;i++)
		{
			System.out.println(org[i]+" ");
			
		}
		int[] copy=Arrays.copyOf(org, 5);
		copy[3]=11;
		copy[4]=78;
		System.out.println("New array copy after modification.");
		for(int i=0;i<copy.length;i++)
		{
			System.out.println(copy[i]+" ");
			
		}

// Yaha par 1 st array copy hogaya dusre array may plus 2 more element added in 2 nd array.
	}

}
