package com.AbstractionProject;

import java.util.Scanner;

abstract class Shape{
	float area;
	abstract public void acceptInput();
	abstract public void compute();
	public void disp()
	{
		System.out.println(+area);
	}
}
final class Squares extends Shape
{
	private float f;

	@Override
	public void acceptInput() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of square");
		f=sc.nextFloat();
		
		
	}

	@Override
	public void compute() {
		// TODO Auto-generated method stub
		area=f*f;
		
	}
	
}
final class Circles extends Shape{
	private float r;

	@Override
	public void acceptInput() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		r=sc.nextFloat();
		
		
		
	}

	@Override
	public void compute() {
		// TODO Auto-generated method stub
		area=3.147f*r*r;
		
	}
	
}
class Geometry
{
	public void acceptShape(Shape ref)
	{
		ref.acceptInput();
		ref.compute();
		ref.disp();
	}
	
}
public class OOPPillarVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squares s =new Squares();
		Circles c=new Circles();
		Geometry g=new Geometry();
		g.acceptShape(s);
		g.acceptShape(c);
		

	}

}
