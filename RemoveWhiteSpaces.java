package com.Saleem.Strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Core Java JSP     Servlet        HIBERNATE";
		String strWithoutSpace=str.replaceAll("\\s", "");
		System.out.println(strWithoutSpace);
		

	}

}
