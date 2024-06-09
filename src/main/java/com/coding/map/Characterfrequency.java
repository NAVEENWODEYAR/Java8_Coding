
package com.coding.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 09-Jun-20248:46:06 pm
 * @classDef 
 */
public class Characterfrequency {

	static void charFrequency(String st) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(char c:st.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
		}
		System.out.println(hashMap);
		charFreq(st);
	}
	
	static void charFreq(String st) {
		st.chars().filter(c->c!=' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
	
	static void wordFreq(List<String> list) {
		list.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().sorted()
			.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		String st = "Programming";
		List<String> list = Arrays.asList("One","Two","Three","Four","Five","Two","Six","Seven","Four");
		System.out.println("\n********\n");
		charFrequency(st);
		System.out.println("\n********\n");
		wordFreq(list);
	}

}
