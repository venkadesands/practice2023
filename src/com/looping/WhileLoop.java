package com.looping;
 
public class WhileLoop {
	public static void main(String[] args) {
//		1.initialization
		int a=0;
//		2.condition checking
		while (a<8) {
//			3.statement executing
			System.out.println(a);
//			4.iteration
			a+=2;
		}
		int b=0;
		do {
			
			System.out.println("do-while\n\t"+b);
			b+=2;
		} while (b<8);
	}
}
