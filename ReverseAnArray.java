package com.ArrayConcept.Array;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]=new String[] {"My","Leg","is","injuired"};
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");//this is word wise reversal.
			// output:injuired is leg my.
			
		}

	}

}
