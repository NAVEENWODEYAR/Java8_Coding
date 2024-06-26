package com.coding.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar 
 * @date 10-Jun-202410:00:16 
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
	
	static Character nonRepeatingStr(String st) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(char c:st.toCharArray()) {
			hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> mp:hashMap.entrySet()) {
			if(mp.getValue()==1) {
				return mp.getKey();
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(nonRepeatingString("null"));
	}
}
