package com.SingletonDesignPattern;
class Student{
	static Student stu=null;
	private Student()
	{
	}
	public static Student getObject()
	{
		if(stu ==null)
		{
			stu=new Student();
			System.out.println(stu);
			return stu;
		}
		return stu;
	}
}
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=Student.getObject();
		System.out.println(s);
		Student s1=Student.getObject();
		System.out.println(s1);

	}

}
