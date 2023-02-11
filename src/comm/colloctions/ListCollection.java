package comm.colloctions;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		l.add(25);
		l.add("venkadesan");
		l.add(40.012399);
		l.add('M');
//	 	l.add(25,30);
		l.add(true);
		System.out.println(l);
//		to check whether the given element is present or not 
		boolean contains = l.contains(25);
		System.out.println(contains);
//		or
		if (l.contains(100)) {
			System.out.println("element is present");
			
		} else {
			System.out.println("element is not present");
		}
//				To check whether list is empty or not
		boolean empty = l.isEmpty();
		System.out.println(empty);
//		to clear all (element)value in the list
		l.clear();
		System.out.println(l);
		boolean empty2 = l.isEmpty();
		System.out.println(empty2);
		int size = l.size();
		System.out.println(size);
//		to fetch(tamil = yedukka) a value by passing index
		Object l2 = l.get(2);
		System.out.println(l2);
		Object l4 = l.get(4);
		System.out.println(l4);
//		now we are call to get unknown declaration,so it will through the exception 
		Object l9 = l.get(9);
		System.out.println(l9);
//		Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 2, Size: 0
//		at java.util.ArrayList.rangeCheck(Unknown Source)
//		at java.util.ArrayList.get(Unknown Source)
//		at comm.colloctions.ListCollection.main(ListCollection.java:37)
		
				
	}

} 
