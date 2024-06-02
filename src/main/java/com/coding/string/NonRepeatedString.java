
package com.coding.string;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 02-Jun-202411:32:53 am
 * @classDef com.coding
 */
public class NonRepeatedString {

	static String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

	static void nonRepeatedString() {	
		 LinkedHashMap<String, Long> collect = Arrays.stream(inputString.split(" "))
		 		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		 
		 String string = collect.entrySet().stream().filter(entry->entry.getValue()==1)
		 							.map(entry->entry.getKey())
		 							.findFirst().get();
		 
		 System.out.println(string);

		 
	}
	
	public static void main(String[] args) {
		nonRepeatedString();
	}

}
