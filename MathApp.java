package com.Interface;

import java.util.Scanner;

interface Calculator{
	public void mul();
	public void div();
}
class MyCalculator1 implements Calculator
{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a=100;
		int b=10;
		int c=a/b;
		System.out.println(c);
		
	}
	
}
class MyCalculator2 implements Calculator{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		
		
	}
	
}
class MyCalculator3 implements Calculator{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("Wrong input");
		}
		else
		{
			int c=a*b;
			System.out.println(c);
		}
		
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(b==0)
		{
			System.out.println("Wrong input");
		}
		else
		{
			int c=a/b;
			System.out.println(c);
		}
		
		
		
		
	}
	
}
class Maths
{
	public void accept(Calculator ref)
	{
		ref.mul();
		ref.div();
	}
}
public class MathApp {
	public static void main (String[] args)
	{
		MyCalculator1 m1=new MyCalculator1();
		MyCalculator2 m2=new MyCalculator2();
		MyCalculator3 m3=new MyCalculator3();
		Maths m=new Maths();
		m.accept(m1);
		m.accept(m2);
		m.accept(m3);
		//Calculator c=new Calculator();
		//Abstract Class cannot be instantiated.
	}

}
