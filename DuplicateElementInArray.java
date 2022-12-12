package com.ArrayConcept.Array;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strArray1[]= {"abcd","def","abc","xyz","abcd"};
		for(int i=0;i<=strArray1.length-1;i++)
		{
			for(int j=1;j<strArray1.length;j++)
			{
				if((strArray1[i].equals(strArray1[j]))&&(i!=j))
				{
					System.out.println("Duplicates are:"+strArray1[j]);
				}
			}
		}

	}

}
