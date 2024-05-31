
package com.coding.string;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar 
 * @date 31-May-202411:20:42 pm
 * @classDef, Reverse each word of a string using Java 8 streams?
 */
public class ReverseWords {
	
    static String str = "Java Concept Of The Day";

	static void reverseWords() {
		String collect = Arrays.stream(str.split(" ")).map(word-> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(str+" "+collect);
	}
	
	public static void main(String[] args) {
		reverseWords();	
	}

}
