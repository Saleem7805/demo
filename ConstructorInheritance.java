package com.saleem.inherit;
class Demos{
	int a;
	int b;
	public void disp()
	{
		System.out.println(a+" "+b);
	}
	public Demos()
	{
		a=10;
		b=20;
	}
}
class Dem extends Demos{
	int c;
	public Dem() {
		c=10;
	}
	public void disp()
	{
		System.out.println(a+b);
		//System.out.println();
	}
}
public class ConstructorInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dem d=new Dem();
		d.disp();

	}

}
