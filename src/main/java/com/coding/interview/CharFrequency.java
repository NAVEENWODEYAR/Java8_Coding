package com.coding.interview;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar 
 * @date 18-Jun-202411:17:28 am
 * @classDef Find highest frequent character in a string using Hashmap,
 */
public class CharFrequency {

	static void charFreq(String st) {
		HashMap<Character, Integer> hm = new HashMap<>();
		System.out.println(st);
		for(char c: st.toLowerCase().toCharArray()) {
			hm.put(c, hm.get(c)+0);
		}
		System.out.println(hm);
	}
	
	static void charFrequency(String st) {
        Entry<Character, Long> entry = st.chars()
            .mapToObj(c -> (char) c) 
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())) 
            .entrySet()
            .stream()
            .sorted(Entry.comparingByValue(Comparator.reverseOrder())) 
            .findFirst()
            .get(); 
        System.out.println(entry);
	}
	
	public static void main(String[] args) {
		String st = "Hashmap";
//		charFreq(st);
		charFrequency(st);
	}

}
