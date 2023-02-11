package com.looping;

public class ReturnFuture {
	private void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	private int sub(int a,int b) {
		int c1=a-b;
		return c1;
	}

	public static void main(String[] args) {
		ReturnFuture future = new ReturnFuture();
		future.add(20, 30);
		int sub = future.sub(60,10);
		System.out.println(sub);
		System.out.println(sub-10);
		System.out.println(sub*10);
		System.out.println(Math.sqrt(sub));
		System.out.println(Math.pow(sub, 3));
	}

}
