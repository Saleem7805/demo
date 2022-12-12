package com.Saleem.Strings;

public class DemoAppString2ReferenceChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Saleem");
		String s1=new String("Saleem");
		if(s==s1)
		{
			System.out.println("References arw equal");
			
		}
		else
		{
			System.out.println("References are unequal");
		}

	}

}
