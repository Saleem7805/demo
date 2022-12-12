package com.saleem.inherit;
class Demooo1
{
	int a =10;
}
class Demooo2 extends Demooo1{
	
}
class Demooo3 extends Demooo2{
	
}
public class MultiLevelInheritances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demooo3 d3=new Demooo3();
		System.out.println(d3.a);

	}

}
