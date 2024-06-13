
package com.coding.str;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jun-202410:26:57 pm
 * @classDef string coding questions,
 */
public class StringQuestions {

	static String st = "String";
	
	static void strReverse() {	
		String rev = "";
		for(int i=st.length()-1; i>=0;i--) {
			rev =rev+rev.charAt(i);
		}
		System.out.println(rev);
		IntStream sorted = st.chars().sorted();
		System.out.println(sorted);
	}
	
	public static void main(String[] args) {
		strReverse();
	}

}
