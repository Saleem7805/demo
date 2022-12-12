package com.saleem.inherit;
// Private members do not participate in inheritance

class Demo1{
	private int a=10;
	private int b=20;
	private void display()
	{
		System.out.println(a +" "+b);
	}
}
class Demo2 extends Demo1{
	int c=a+b;
	public void disp() {
		System.out.println(c);
	}
}
public class PrivateInheritances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d2=new Demo2();
		d2.disp();
		d2.display();
		

	}

}
