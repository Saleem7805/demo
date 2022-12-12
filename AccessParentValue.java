package com.saleem.inherit;
class Demoooo{
	
		int a=10;
	
	
}
class Demo12 extends Demoooo{
	int a=12;
	int b=20;
}
public class AccessParentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo12 d=new Demo12();
		Demoooo d1=new Demoooo();
		System.out.println(d.a);
		System.out.println(d1.a);
		

	}

}
