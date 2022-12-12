package com.AbstractionProject;

import java.util.Scanner;

class Square
{
	float length;
	float area;
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of square");
		length=sc.nextFloat();
	}
	public void compute()
	{
		area=length*length;
	}
	public void display()
	{
		System.out.println("Area is "+area);
		
	}
}

class Circle
{
	float radius;
	float area;
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		radius=sc.nextFloat();
	}
	public void compute()
	{
		area=3.147f*radius*radius;
	}
	public void display()
	{
		System.out.println("Area is "+area);
		
	}
}
public class NonOOPPillarVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s =new Square();
		Circle c=new Circle();
		s.acceptInput();
		s.compute();
		s.display();
		System.out.println("-------------------------------------");
		c.acceptInput();
		c.compute();
		c.display();

	}

}
