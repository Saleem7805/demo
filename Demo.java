package com.Super.keywords;
class App{
	int i=20;
}
class App1 extends App{
	int i=10;
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App1 a=new App1();
		System.out.println(a.i);
		App aa=new App();
		System.out.println(aa.i);
		

	}

}
