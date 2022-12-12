package com.Saleem.AccessingSpecializedMethod;
interface Calculator{
	public void mul();
	public void div();
}
// in order to access the specialized behavior downcasting is to be done.
class MyCalculator1 implements Calculator{

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int a=20;
		int b=20;
		int c=a/b;
		System.out.println(c);
		

		
		
	}
	public void op()
	{
		System.out.println("Doing mathematical operations.");
	}

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Adding operation");
		
	}
	
}
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ref=new MyCalculator1();
		ref.mul();
		ref.div();
		((MyCalculator1)(ref)).add();// downcasting
		
		

		((MyCalculator1)(ref)).op();//downcasting
		
	}

}
