package com.Saleem.Strings;

public class String2IntegerConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2015";
		int i=Integer.parseInt(s);// returns primitive integer value.
		System.out.println(i);
		int x=Integer.valueOf(s);//java.lang.Integer object.
		System.out.println(x);

	}

}
