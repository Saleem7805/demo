package com.DSA;

import java.util.Iterator;
import java.util.PriorityQueue;
class Student implements Comparable<Student>
{
	private int rank;
	private String name;
	public Student(String name,int rank)
	{
		this.name=name;
		this.rank=rank;
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(rank<o.rank)
		{
			return -1;
		}
		else if(rank>o.rank)
		{
			return 1;
		}
		return 0;
	}
	public String toString()
	{
		String result="Student name: "+ name +" rank:  "+ rank;
		return result;
		
	}
	
}

public class LearnPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student>s=new PriorityQueue<>();
		s.add(new Student("Ashish",5));
		s.add(new Student("Rahul",3));
		s.add(new Student("Sumit",1));
		s.add(new Student("Avinash",4));
		s.add(new Student("Vivek",2));
		System.out.println("Size of queue "+s.size());
		Iterator<Student>it=s.iterator();
		while(it.hasNext())
		{
			System.out.println("The item of the queue "+s.poll().toString());
		}
		

	}

}
