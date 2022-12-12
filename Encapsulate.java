package com.saleem.encapsulate;
class Fan
// setter is equivalent to constructor.
{
	private String brand;
	private int cost;
	public Fan(String brand,int cost)
	{
		this.brand=brand;
		this.cost=cost;
		
	}
	public String getBrand() {
		return brand;
	}
	
	public int getCost() {
		return cost;
	}
	
	
}
public class Encapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan=new Fan("Usha",12000);
		System.out.println(fan.getBrand());
		System.out.println(fan.getCost());

	}

}
