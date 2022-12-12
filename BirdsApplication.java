package com.AbstractionProject;
abstract class Birds{
	abstract public void fly();
	abstract public void eat();
	
}
abstract class Eagles extends Birds{
	public void fly()
	{
		System.out.println("Eagle is flying very high.");
	}
}
abstract class Sparrows extends Birds{
	public void fly()
	{
		System.out.println("Sparrow is flying very low.");
	}
}
final class GoldenEagles extends Eagles
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Golden Eagle is eating food.");
		
	}
	
}
final class BlackSparrow extends Sparrows
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Black sparrow is eating insects.");
		
	}
	
}
class BirdSpecification
{
	public void acceptBirds(Birds ref)
	{
		ref.fly();
		ref.eat();
	}
}
public class BirdsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdSpecification bs=new BirdSpecification();
		GoldenEagles ge=new GoldenEagles();
		BlackSparrow bs1=new BlackSparrow();
//		Sparrows s=new Sparrows();
		bs.acceptBirds(ge);
		bs.acceptBirds(bs1);
		
		

	}

}
