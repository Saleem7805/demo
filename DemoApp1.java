package com.Saleem.Overridding;
class Demo11{
	public void add()
	{
		int a=10;
		int b=90;
		int c=a+b;
		System.out.println(c);
	}
}
class Demo12 extends Demo11{
	public int add() {
		//The return type of parent and child class should be same.
		// return type is incompatible.
		int a=100;
		int b=200;
		int c=a+b;
		return c;
	}
	
}
public class DemoApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo12 d=new Demo12();
		d.add();
		

	}

}
