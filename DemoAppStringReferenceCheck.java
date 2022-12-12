package com.Saleem.Strings;

public class DemoAppStringReferenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an immutable string by string keyword.
		/*The strings that are created by string keyword goes in constant pool
		 * if string is equal i.e. string is already present then reference is
		 *  shared ,no new string is created */
		String s="Citiustech";
		String s1="Citiustech";
		if(s==s1)
		{
			System.out.println("References are equal");
			
		}
		else
		{
			System.out.println("References are unequal");
		}

	}

}
