package com.stringmethods;

public class StringBuffer {
	

	public static void main(String[] args) {
		String s1="Greens";
		String s2="Tech";
		System.out.println("Immutable String");
		System.out.println("Address of s1 : "+System.identityHashCode(s1));
		System.out.println("Address of s2 : "+System.identityHashCode(s2));
		s1=s1.concat(s2);
		System.out.println("value of s1 After concat :"+s1);
		System.out.println("address of s1 After concat : "+System.identityHashCode(s1));
		
		StringBuffer buffer=new StringBuffer();
		StringBuffer buffer2=new StringBuffer();
		System.out.println("\nMutable String");
		System.out.println("Address of buffer :"+System.identityHashCode(buffer));
		System.out.println("Address of s4 :"+System.identityHashCode(buffer2));
		
	}
}
