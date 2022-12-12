package com.Super.keywords;
class Dem{
	int i=10;
}
class Demo1 extends Dem{
	int i=20;
	public void disp()
	{
		System.out.println(i);
		System.out.println(super.i);//super keyword used in method.
	}
}
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.disp();

	}

}
