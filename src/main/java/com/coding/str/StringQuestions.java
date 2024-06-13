
package com.coding.str;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jun-202410:26:57 pm
 * @classDef string coding questions,
 */
public class StringQuestions {
	static String st = "String";
	
	static void strReverse() {	
		String rev = "";
		int length = st.length();
		for(int i=st.length()-1; i>=0;i--) {			
			rev =rev+st.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		strReverse();
	}

}
