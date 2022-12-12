package com.AbstractionProject;
final abstract class Plane 
//Class can either be final or abstract but not both.Hence the error.
{
	abstract public void takeoff();
	abstract public void fly();
	class CargoPlane extends Plane{
		public void takeoff()
		{
			System.out.println("CargoPlane is taking take off.");
		}
		public void fly()
		{
			System.out.println("Cargo plane is flying high.");
		}
	}
}
public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp=new CargoPlane();
		cp.takeoff();
		cp.fly();

	}

}
