package com.AbstractionProject;
abstract class Bird
{
	abstract public void fly();
	abstract public void eat();
}
abstract class Eagle extends Bird
{
	public void fly()
	{
		System.out.println("Eagle is flying very high.");
	}
}
abstract class Sparrow extends Bird
{
	public void fly()
	{
		System.out.println("Sparrow is flying low in height.");
	}
}
final class GoldenEagle extends Eagle
{
	public void eat()
	{
		System.out.println("Golden fish eats fish");
	}
}
final class SparrowEagle extends Eagle{
	public void eat()
	{
		System.out.println("Sparrow eagle eats insects.");
	}
}
final class VegSparrow extends Sparrow{
	public void eat()
	{
		System.out.println("Veg sparrow eats grass.");
	}
}
final class NonVegSparrow extends Sparrow{
	public void eat()
	{
		System.out.println("Non veg sparrow eats meat.");
	}
}
class Sky
{
	public void acceptBird(Bird ref)
	{
		ref.fly();
		ref.eat();
	}
}
public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldenEagle ge =new GoldenEagle();
		VegSparrow vs = new VegSparrow();
		NonVegSparrow ns=new NonVegSparrow();
		Sky sky =new Sky();
		sky.acceptBird(ge);
		sky.acceptBird(vs);
		sky.acceptBird(ns);
		

	}

}
