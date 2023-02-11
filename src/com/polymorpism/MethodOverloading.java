package com.polymorpism;

public class MethodOverloading {
//	method overloading --> 
//	in class class name & method name will be same difference based on data type,count, data order..
	public void overLoading(int a) {
		System.out.println("Based on the dataType"+a);
		}
	public void overLoading() {
		System.out.println("Same method name without parameter");
	}
	public void overLoading(int a,float c) {
		System.out.println("Same method name without parameter"+a+"\n"+c);
	}
	public void overLoading(float c,int a,int b) {
		System.out.println("Same method name without parameter"+c+"\n"+a+"\n"+b);
	}
	public static void main(String[] args) {
		MethodOverloading ol= new MethodOverloading();
		ol.overLoading();
		ol.overLoading(100);
		ol.overLoading(100,101.5f);
		ol.overLoading(25.8f,222,303);
	}
	
}
