package com.saleem.polymorphics;
class Teachers{
	public void markAttendance() {
		System.out.println("Teacher is marking attendance");
	}
	public void teach() {
		System.out.println("Teacher is teaching.");
		System.out.println("--------------------------------------------");
	}
}
class PhysicsTeachers extends Teachers
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
class ChemistryTeachers extends Teacher
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
class College{
	public void permit(Teacher t)
	{
		t.markAttendance();
		t.teach();
		t.doLabExp();
	}
}
public class PolymorphicVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsTeacher pt=new PhysicsTeacher();
		ChemistryTeacher ct =new ChemistryTeacher();
		College c=new College();
		c.permit(pt);
		c.permit(ct);

	}

}
