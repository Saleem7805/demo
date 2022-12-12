package com.DSA;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>studentName=new ArrayList<>();
		studentName.add("Rahul");
		studentName.add("Amit");
		studentName.add("Sonu");
		studentName.add("Ravi");
		System.out.println(studentName);
		studentName.add(1, "Avinash");
		System.out.println(studentName);
		System.out.println(studentName.get(0));
		studentName.remove(3);
		System.out.println(studentName);
		System.out.println(studentName.contains("Ravi"));
		for(int i=0;i<studentName.size();i++)
		{
			System.out.println("The student list at index "+i+" is "+studentName.get(i));
		}
		
		
		

	}

}
