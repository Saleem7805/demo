package com.Saleem.AggregateComposite;
class Os
{
	int size;
	String name;
	public Os(int size,String name)
	{
		this.size=size;
		this.name=name;
		
	}
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	
}
class Charger{
	String color;
	String brand;
	public Charger(String color,String brand)
	{
		this.brand=brand;
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	
}
class Mobile
{
	Os os=new Os(32,"Windows");
	public void acceptCharger(Charger ref)
	{
		System.out.println(ref.getColor());//white
		System.out.println(ref.getBrand());//Samsung
		
	}
}
public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		System.out.println(m.os.getName());//Windows.
		System.out.println(m.os.getSize());//32
	Charger c=new Charger("White","Samsung");
	m.acceptCharger(c);
	m=null;
	System.out.println(m.os.getName());//null pointer
	System.out.println(m.os.getSize());//null pointer
	System.out.println(c.getBrand());
	System.out.println(c.getColor());

//As soon as mobile is destroyed OS is destroyed but charger is not destroyed.
	//OS relation with mobile is a composite one. (tightly coupled)
	// charger relation with mobile is aggregation one.(loosely coupled).

	}

}
