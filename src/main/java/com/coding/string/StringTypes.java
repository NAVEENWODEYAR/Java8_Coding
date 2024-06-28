package com.coding.string;

import java.util.*;
/**
 * @author Naveen K Wodeyar 
 * @date 28-Jun-202411:39:22 am
 * @classDef com.coding
 */
public class StringTypes{

	static void strTypes() {
		
		stringJoiner();
		replace("null", 'l');
		System.exit(0);
		
		String st = "String";
		String st1 = new String(st);
		String st2 = st;
		System.out.println(st==st2);
		byte[] bytes = st.getBytes();
		System.out.println(Arrays.toString(bytes));
		System.out.println(st.subSequence(2, 6));
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.append(st));
		System.out.println(sb.equals(sb));
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		System.out.println(buffer.append(st)); 
		System.out.println(buffer.substring(2,5));
	
	}
	

	static void stringJoiner() {
		StringJoiner sj = new StringJoiner(",");
					sj.add("One");
					sj.add("Two");
					sj.add("Three");
					sj.add("Four");
					sj.add("Five");
		System.out.println(sj);
		
		StringJoiner sj1 = new  StringJoiner(",", "[", "]");
					sj1.add("1");
					sj1.add("2");
					sj1.add("3");
					sj1.add("4");
					sj1.add("5");
	   System.out.println(sj1);
	   
	   String str = "1296";
	   int parseInt = Integer.parseInt(str);
	   System.out.println(str.isBlank()+"\n"+parseInt);
		System.out.println("String length "+strLength());
	}
	
	static int strLength() {
		int arr[] = {1,2,3,4,5,6,7,8};
		String st = arr.toString();
		return st.length();
	}
	
	static void replace(String st,char c) {
		System.out.println("\nAfter replacing "+st.replace("l","").toString());
	}
	
	public static void main(String[] args) {
		strTypes();
		
	}

}
