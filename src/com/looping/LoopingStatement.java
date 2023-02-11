package com.looping;

public class LoopingStatement {
	public static void main(String[] args) {
		System.out.println("for loop \n1.intialzation \n2.condition checking \n3.executing block statement \n4.itration");
//		for (int i = 1; i < 8; i++) {
//			System.out.println("\t"+i);
//		}
		for (int i = 0; i < 8; i+=2) {
			System.out.println(i);
			System.out.println("done-intallization and condtion checking");
			System.out.println("Success--after checking the condition the statement executing in the block");
			
		}
		/*
		 * 1		 2		3		4
		 * 1=1	 	i<8     s(i)    i++
		 * ===============================
		 * i=1	 	1<8t	1		1+1
		 * i=2		2<8t	2		2+1
		 * i=3		3<8t	3		3+1
		 * i=4		4<8t	4		4+1
		 * i=5		5<8t	5		5+1
		 * i=6		6<8t	6		6+1
		 * i=7		7<8t	7		7+1
		 * i=8		8<8f............................
		 * 
		 * */
	}
	

}
