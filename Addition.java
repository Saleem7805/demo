package com.ineuron;
class Add{
	int a,b,c;
	int add()
	{
		a=10;
		b=20;
		int res=a+b;
		return res;
		
	}
}
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		int z=a.add();
		System.out.println(z);

	}

}
