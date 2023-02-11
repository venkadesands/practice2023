package com.scannermethods;

import java.util.Scanner;

public class ScannerMethods {
// Exception ==> InputMismatchExeption 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter your Age");
		int age = scanner.nextInt();
		System.out.println("Enter your PHNo");
		long phno = scanner.nextLong();
		System.out.println("Enter Your Salary");
		float salary = scanner.nextFloat();
		System.out.println("Enter your gender");
		char gender = scanner.next().charAt(0);
		
//		print all getting user information
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
		System.out.println("phno :"+phno);
		System.out.println("salary :"+salary);
		System.out.println("gender :"+gender);
	}

}
