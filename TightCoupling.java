package com.saleem.polymorphics;
class Teacher{
	public void markAttendance() {
		System.out.println("Teacher is marking attendance");
	}
	public void teach() {
		System.out.println("Teacher is teaching.");
		System.out.println("--------------------------------------------");
	}
	public void doLabExp() {
		// TODO Auto-generated method stub
		System.out.println("Teacher is doing lab.");
		
	}
}
class PhysicsTeacher extends Teacher
{
	public void teach() {
		System.out.println("Physics Teacher is teaching.");
	}
	public void doLabExp()
	{
		System.out.println("Physics teacher performing lab");
		System.out.println("--------------------------------------------");
	}
	
}
class ChemistryTeacher extends Teacher
{
	public void teach() {
		System.out.println("Chemistry Teacher is teaching.");
	}
	public void doLabExp()
	{
		System.out.println("Chemistry teacher performing lab");
		System.out.println("--------------------------------------------");
	}
	
}
public class TightCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		t.markAttendance();
		t.teach();
		PhysicsTeacher pt=new PhysicsTeacher();
		pt.teach();
		pt.doLabExp();
		ChemistryTeacher ct=new ChemistryTeacher();
		ct.teach();
		ct.doLabExp();

	}

}
