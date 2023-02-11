package com.stringmethods;

public class StringMethods2 {
//	private static String trim;

	public static void main(String[] args) {
		String s = "computer programming";
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt == 'm') {
				System.out.println(charAt);
				System.out.println("The position of M is" + i);
			}
		}
//	to find the index position
		int indexOf = s.indexOf('m');
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf('m');
		System.out.println(lastIndexOf);
		int indexOf2 = s.indexOf('m', 5);
		System.out.println(indexOf2);
		String s1 = "Apple";
		String s2 = "apple";
//	to check the Equality with case
		boolean equals = s1.equals(s2);
		System.out.println("equals (s1,s2)with case sencitive=>" + equals);
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println("equalsIgnoreCase=>" + equalsIgnoreCase);
		String concat = s1.concat(s2);
		System.out.println(concat);
		System.out.println(s1 + " " + s2);
		int compareTo = s1.compareTo(s2);
		System.out.println("compareTo =>" + compareTo);
		String s3 = "         Venkadesan Keerthana      ";
		String trim2 = s3.trim();
		System.out.println(s3);
		System.out.println(trim2);

//	vowels and cons Using For Loop and If,else
		int vowel = 0, con = 0;
		for (int i = 0; i < s3.length(); i++) {
			char charAt = s3.charAt(i);
			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
				vowel++;
			} else {
				con++;
			}

		}
		System.out.println("vowels COntainsin the string =>" + vowel);
		System.out.println("cons contain in the String =>" + con);
		String s4= "Hii Welcome to Java Platform";
		String[] split = s4.split(" ");
		
		for (String string : split) {
			System.out.println(string);
		}
		System.out.println(split);
		
	}
	
	
}
