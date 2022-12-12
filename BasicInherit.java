package com.saleem.inherit;
//Notes:
//Rules of inheritances in Short:
// 1.child inherit parent property basic simple rule.
// 2. constructor and private member does not participate in inheritance.
//3.multiple inheritance not allowed.
//4.multi level inheritance allowed.2---1,3---2,4----3.

class Demo{
	int a=10;
	int b=20;

public void disp()
{
	System.out.println(a+" "+b);
}
}
class Demo2 extends Demo{
	int c=a+b;
	public void disp2()
	{
		System.out.println("i am in demo2 class.");
		System.out.println(c);
	}
}
public class BasicInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d2=new Demo2();
		d2.disp2();
		d2.disp();
		
		

	}

}
