package com.array;

public class Array {
//	Exception in thread "main" java.lang.
//	ArrayIndexOutOfBoundsException: 5
//	at com.array.Array.main(Array.java:13)

	public static void main(String[] args) {
//		datatype ref[]=new datatype[size];
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		System.out.println(a[5]);
		int b[]= {10,20,30,40,50,60};
		
		System.out.println("normal for loop");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		System.out.println("enhanced for loop");
//		enhanced for loop
//			1.work based on value based
//			2.can't able to apply condition and 
//			3.can't able to iteration forward or reverse
//			4.no change for exception
		for (int i : b) {
			System.out.println(i);
			
		}
	}

}
