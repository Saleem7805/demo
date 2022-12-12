package com.saleem.encapsulate;
class Student{
	private String name;
	private int rollNo;
	private String location;
	public Student(String name, int rollNo, String location) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getLocation() {
		return location;
	}
	
}
public class DemoEncapsulate {
	Student s=new Student("Saleem",78,"Bangalore");
	
	
	
	
	
	
	

}
