package com.Saleem.Overridding;
class Animal
{
	
}
class Tiger extends Animal{
	
}
class Demo111{
	public Animal disp()
	{
		Animal a =new Animal();
		System.out.println(a);
		return a;
		
	}
}
class Demo222 extends Demo111{
	public Tiger disp()
	{
		Tiger t =new Tiger();
		System.out.println(t);
		return t;
	}
}
public class ThirdRuleOverrideThatIIsCovariantType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo222 d1=new Demo222();
		Tiger res=d1.disp();
		System.out.println(res);

	}

}
