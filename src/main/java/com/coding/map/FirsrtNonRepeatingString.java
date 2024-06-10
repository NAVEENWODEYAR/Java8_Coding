
package com.coding.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar 
 * @date 10-Jun-202410:00:16 pm
 * @classDef find first non repeating string,
 */
public class FirsrtNonRepeatingString {

	static Character nonRepeatingString(String st) {
		 return st.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
	}
	public static void main(String[] args) {
		System.out.println(nonRepeatingString("nunll"));

	}

}
