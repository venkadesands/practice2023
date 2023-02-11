	package com.looping;

import java.util.Scanner;

public class SwitchCases {
	
		public static void main(String[] args) {
			Scanner out = new Scanner(System.in);
			out.nextInt();
			int day=13;
			switch (day) {
			case 1:
				System.out.println("sunday");
				break;
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			default:
				System.out.println("day is not present");
				break;
				
				
			}
	}

}
