package com.AbstractionProject;
abstract class Exam{
	abstract void takeMarks();
	abstract void calculateMarks();
}
final class College extends Exam{
	@Override
	void takeMarks()
	{
		System.out.println("College checks the copy according to University ");
	}
		@Override
	void calculateMarks() {
		// TODO Auto-generated method stub
			System.out.println("College is following CGPA system.");
		
	}
		public void collegeRules()
		{
			System.out.println("College rules followed");
			System.out.println("---------------------------");
		}

}
 final class School extends Exam{
	 @Override
	void takeMarks()
	{
		System.out.println("Invigilator checks the copy.");
	}
		@Override
	void calculateMarks() {
		// TODO Auto-generated method stub
			System.out.println("College is following CGPA system.");
		
	}
		public void schoolRule()
		{
			System.out.println("Mark given in school way");
			System.out.println("---------------------------------");
		}

}
 class ExamSpecification
 {
	 public void acceptPara(Exam ref)
	 {
		 ref.takeMarks();
		 ref.calculateMarks();
		 ((School) ref).schoolRule();
		 ((College) ref).collegeRules();
		 
		 
	 }
 }

public class ExamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamSpecification es=new ExamSpecification();
		College c=new College();
		School s=new School();
		es.acceptPara(s);
		es.acceptPara(c);
		

	}

}
