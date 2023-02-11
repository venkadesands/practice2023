package com.looping;

public class Breakandcontinue {
	/*
	 * break --> used to terminate the loop
	 * continue-->used to skip particular iteration
	 * system.exit-->used to terminate the program
	 * return-->to retrieve value from any method*/
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			if (i==2||i==5) {
			System.out.println("continue=the 2 and 5 skip the list");
				continue;
//				break;
				
			}
			System.out.println(i);
		}
		System.out.println("done");
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				System.exit(i);
//				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("done");
	}

}
