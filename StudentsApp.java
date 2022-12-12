package com.AbstractionProject;
abstract class Student{
	abstract void learn();
	abstract void getMarks();
}
final class StudentPortal extends Student{
	void learn()
	{
		System.out.println("Student is learning in the school.");
	}
	void getMarks()
	{
		System.out.println("Student is getting marks in the school.");

	}
}
class StudentSpecification{
	public void acceptParameter(Student ref)
	{
		ref.learn();
		ref.getMarks();
	}
}
public class StudentsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentPortal sp=new StudentPortal();
		StudentSpecification ss=new StudentSpecification();
		ss.acceptParameter(sp);
		

	}

}
