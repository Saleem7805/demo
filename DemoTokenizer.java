package com.Saleem.Strings;

import java.util.StringTokenizer;

public class DemoTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringTokenizer st=new StringTokenizer("Kodnest Technology Private Ltd"," "); 
     while(st.hasMoreTokens())
     {
    	 System.out.println(st.nextToken());
     }
	}

}
