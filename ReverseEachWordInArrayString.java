package com.ArrayConcept.Array;

import java.util.StringTokenizer;

public class ReverseEachWordInArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[] {"My","Leg","is","injuired"};
		StringTokenizer str=new StringTokenizer(",");
		while(str.hasMoreElements())
		{
			String input=str.nextToken();
			String reverse=new StringBuffer(input).reverse().toString();
			System.out.println(reverse);
		}

	}

}
