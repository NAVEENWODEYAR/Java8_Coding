
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
	public static void main(String[] args) {
		System.out.println(palindromeTest()?"Palindrome":"Not palindrome");
	}

}
