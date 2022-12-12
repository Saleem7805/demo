package com.DSA;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LAST IN FIRST OUT.
		Stack<String>animals=new Stack<>();
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Horse");
		animals.push("Zebra");
		animals.push("Cow");
		System.out.println(animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println(animals.peek());
		
		
		

	}

}
