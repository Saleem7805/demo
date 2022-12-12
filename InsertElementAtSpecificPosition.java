package com.ArrayConcept.Array;

import java.util.Arrays;

public class InsertElementAtSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_array[]= {25,14,56,15,36,56,77,18,29,49};
		int index_position=2;
		int new_value=5;
		System.out.println("Original Array"+Arrays.toString(my_array));
		for(int i=my_array.length-1;i>index_position;i--)
		{
			my_array[i]=my_array[i-1];
		}
		my_array[index_position]=new_value;
		System.out.println("New Array:"+Arrays.toString(my_array));

	}

}
