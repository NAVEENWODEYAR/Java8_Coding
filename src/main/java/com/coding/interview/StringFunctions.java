package com.coding.interview;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar 
 * @date 19-Jun-202411:11:19 pm
 * @classDef program to split the string by space
 */
public class StringFunctions {

	static void stringSplit(String st) {
		String[] split = st.split("");
		System.out.println(st+"-"+Arrays.toString(split));
		
		Object[] array = Arrays.stream(st.split("")).toArray();
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(st.split("")));

	}
	
	public static void main(String[] args) {
		stringSplit("String");
	}

}