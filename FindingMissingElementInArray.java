package com.ArrayConcept.Array;

public class FindingMissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,5,6,7};
		int n=arr.length+1;
		int total=n*(n+1)/2;
		for(int i=0;i<arr.length;i++)
		{
			total=total-arr[i];
		}
		System.out.println(total);

	}
// calculate sum of numbers in array and compare with expected sum . difference is missing number.
}
