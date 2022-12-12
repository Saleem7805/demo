package com.Saleem.AccessingSpecializedMethod;
interface RBI{
	default void withdrawl() // default is allowed 
	{
		System.out.println();
	}
	static void deposit()
	{
		System.out.println();
	}
//	public void withdrawl1() // Abstract method does specify body.
//	{
//		
//	}
	private void withdrawl11() //We can have private member in the interface .
	
	{
		
	}
}
public class ICICI implements RBI{
	
// static member ka overriden method may nahi ho sakta hai.

//	@Override
//	public void withdrawl1() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}
public class NewFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI icici =new ICICI();
		((Object) icici).withdrawl1();
		RBI.deposit();
		

	}

}
