package com.ArrayConcept.Array;

public class CopyArray2AnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using for loop.
		int arr1[]=new int[]{78,89,888,78,5};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i]; // copying elements.
		}
		System.out.println("Element of original array");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Element of new array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]+" ");
		}

	}

}
