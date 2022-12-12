package com.saleem.inherit;
class Teacher{
	public void markAttendance()
	{
		System.out.println("Teacher is marking attendance");
	}
	public void doTeach()
	{
		System.out.println("Teacher is teaching.");
	}
}
class PhysicsTeacher extends Teacher{
	public void doTeach()
	{
		System.out.println("Physics teacher is teaching.");
	}
	public void doLab()
	{
		System.out.println("Physics teacher is doing Physics lab ");
	}

}
class ChemistryTeacher extends Teacher{
	public void doTeach()
	{
		System.out.println("Chemistry teacher is teaching.");
	}
	public void doChemLab()
	{
		System.out.println("Chemistry teacher is doing Chemistry lab ");
	}

}

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		PhysicsTeacher pt=new PhysicsTeacher();
		ChemistryTeacher ct=new ChemistryTeacher();
		t=pt;
		t.doTeach();
		//t.doLab(); It gives error because parent cannot specialized method.
		((PhysicsTeacher) t).doLab();// solution is downcasting.
		t.markAttendance();
		

	}

}
