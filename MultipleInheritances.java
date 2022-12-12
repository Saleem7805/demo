package com.saleem.inherit;
class Demoo{
	int a=10;
}
class Demoo1{
	int b=20;
}
class Demoo2 extends Demoo,Demoo1{
	public void disp() {
		System.out.println(a);
	}
}
public class MultipleInheritances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoo2 d2=new Demoo2();
		d2.disp();

	}

}
