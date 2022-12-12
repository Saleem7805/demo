package com.ArrayConcept.Array;

public class ArrayCopyUsingSystemArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {0,1,2,3,4,5};
		int arr2[]= {5,10,20,30,40,50};
		System.arraycopy(arr1, 0, arr2, 0, 6);
		//arraycopy(src array,starting pos of src array,destn array,starting position 
		// in destn data, element length to be copied.)
		System.out.println("array2= ");
		System.out.println(arr2[0]+" ");
		System.out.println(arr2[1]+" ");
		System.out.println(arr2[2]+" ");
		System.out.println(arr2[3]+" ");
		System.out.println(arr2[4]+" ");

	}

}
