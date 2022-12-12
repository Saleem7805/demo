package com.Saleem.AccessingSpecializedMethod;
interface Calci1{
	public void mul();
	public void div();
	
}
interface Calci2{
	public void add();
	public void sub();
}
class MulCalci implements Calci1,Calci2{
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public void div()
	{
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
}
public class NewFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulCalci mc=new MulCalci();
		mc.add();
		mc.div();
		mc.sub();
		mc.mul();

	}

}
