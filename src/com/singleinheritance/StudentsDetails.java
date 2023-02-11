package com.singleinheritance;

public class StudentsDetails extends CourseDetails {
	private void studentName() {
		String s="Venkadesan";
		System.out.println("The Student Name is  :="+s);
	}
	private void studentCollage() {
		String s1="TCS,Bangalore";
		System.out.println("The student working now in ="+s1);
	}
	
	public static void main(String[] args) {
		StudentsDetails details=new StudentsDetails();
		details.studentName();
		details.python();
		details.java1();
		details.studentCollage();
	}

}
