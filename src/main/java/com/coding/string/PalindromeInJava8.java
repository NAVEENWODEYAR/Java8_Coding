package com.coding.string;

import java.util.stream.IntStream;
/**
 * @author Naveen K Wodeyar
 * @date 01/06/2024
 * @apiNote, palindrome in java8,
 */
public class PalindromeInJava8 {
	static String str = new String("ROtoR");
	
	static Boolean palindromeTest() {
		return IntStream.range(0, str.length()/2).allMatch(s->str.toLowerCase().charAt(s) == str.toLowerCase().charAt(str.length()-s-1));
	}
	
	static boolean palindrome(String st) {
		StringBuilder sb = new StringBuilder(st.toLowerCase());
		return st.toLowerCase().equals(sb.reverse().toString());
	}
	
	static boolean palindromeLoop() {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev +=str.charAt(i);
		}	
		String st = rev.toLowerCase();
		if(st.equalsIgnoreCase(str))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(palindromeTest()?"Palindrome":"Not palindrome\n");
		System.out.println(palindrome(str)?"Palindrome":"Not palindrome");
		System.out.println(palindromeLoop()?"Palindrome":"Not palindrome");
	}

}
