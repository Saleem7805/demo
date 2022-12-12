package com.Saleem.Strings;

public class DemoAppStringsRefCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String created by new keyword is in non constant pool whereas 
		//string created by string is in constant pool.hence references 
		//are unequal
		String s="KODNEST";
		String s1=new String("KODNEST");
		if(s==s1)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("Referenes are unequal");
		}

	}

}
