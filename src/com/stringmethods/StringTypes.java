 package com.stringmethods;

public class StringTypes {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println("Literal String");
		System.out.println("Address of s1 : "+System.identityHashCode(s1));
		System.out.println("Address of s2 : "+System.identityHashCode(s2));
		
		String s3 = new String("Selenium");
		String s4 = new String("Selenium");
		System.out.println("\nnon Literal String");
		System.out.println("Address of s3 : "+System.identityHashCode(s3));
		System.out.println("Address of s4 : "+System.identityHashCode(s4));

	}

}
