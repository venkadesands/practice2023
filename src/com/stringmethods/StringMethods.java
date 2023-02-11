package com.stringmethods;

public class StringMethods {
	/*
	 * String ======= String is a predefined class present in java.lang package.
	 * String is defined as collection of characters enclosed within the "" Default
	 * value of String is null String is an index based one ----position index
	 * starts with 0 and end with n-1, whrn the length of the string is n length =
	 * last index +1. "java 1@"------------------length = 7 --------0 to 6 j a v a
	 * 1 @ 0 1 2 3 4 5 6 String Methods: ---------------- length()----length of the
	 * String toUpperCase()---to convert all letter to capital toLowerCase()---to
	 * convert all letters to lower replace()----to replace a letter
	 * replaceAll()---to replace a sequence CharAt()---to fetch a letter by passing
	 * index indexOf()---to find the index position isEmpty()--to check whether
	 * string is empty or not equals()--to check equality of two string
	 */
	public static void main(String[] args) {
		String s = "computer Program";
//	to find the length
		int length = s.length();
		System.out.println(length + " is length of the string");
//	to convert all the letter into upper case
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
//	to convert all the letter into lower case
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
//	to replace a single char
		String replace = s.replace('o', '*');
		System.out.println(replace);
//	to replace all the sqeunce
		String replaceAll = s.replaceAll("computer", "testing");
		System.out.println(replaceAll);
//	to check the 
		boolean startsWith = s.startsWith("com");
		System.out.println(startsWith);
		char charAt = s.charAt(0);
		System.out.println("the character of the string in index based==" + charAt);
		char charAt2 = s.charAt(1);
		System.out.println("the character of the string in index based==" + charAt2);
//	using for loop&charAt get all the character
//		count owels in the given sentence
		System.out.println("count owels in the given sentence");
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char charAt3 = s.charAt(i);
			if (charAt3 == 'a' || charAt3 == 'e' || charAt3 == 'i' || charAt3 == 'o' || charAt3 == 'u') {
				count++;
			}


		}
		System.out.println(count);
//		to fetch the char
		char charAt4 = s.charAt(2);
		System.out.println(charAt4);
	}
}
