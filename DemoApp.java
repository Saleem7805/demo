package com.Saleem.Overridding;
class Demo
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
class Demo1 extends Demo
{
	void add() 
	//Cannot reduce the visibility of the inherited method from Demo.
	// 1 st rule of method overriding.
	// VVI: we cannot decrease the visibility while overriding in child class
	//solution:make public void add() in demo1 class.
	{
		int a=20;
		int b=50;
		int c=a+b;
		System.out.println(c);
	}
}
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.add();
		Demo1 d1=new Demo1();
		d1.add();

	}

}
