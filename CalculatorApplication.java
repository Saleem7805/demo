package com.Interface;
interface Calculators{
	public void multiply();
	public void divide();
}
class MyCalculator implements Calculators{

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
		
	}

	public void add()
	{
		int a=10;
		int b=2;
		int c=a+b;
		System.out.println(c);
		

	}
	
}
public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculators ref=new MyCalculator();
		ref.divide();
		ref.multiply();
		((MyCalculator) ref).add();

	}

}
