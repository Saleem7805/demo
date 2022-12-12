package com.ArrayConcept.Array;

import java.util.Arrays;

public class PrintElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int schoolmarks[]= {25,45,78,90,100};
		//Using toString method we can print elements of array.
		System.out.println(Arrays.toString(schoolmarks));
		// Compare 2 Arrays.
		int[]num1= {1,2,3};
		int[]num2= {4,5,6};
		int[]num3= {1,2,3};
		System.out.println(Arrays.equals(num1, num2));
		System.out.println(Arrays.equals(num1, num3));
		//Sorting an Array
		int M[]= {12,5,7,78,1};
		Arrays.sort(M);
		System.out.println(Arrays.toString(M));
		// If anyone insert integer element in string array then we get arraystoreException .
		//Anonymous Array
		System.out.println(new int[] {45,89,90,77,66,567}.length);
		System.out.println(new int[] {45,89,90,77,66,567}[1]);
		

	}

}
