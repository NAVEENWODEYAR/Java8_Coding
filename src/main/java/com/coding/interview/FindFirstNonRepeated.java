package com.coding.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar 
 * @date 18-Jun-202412:34:06 pm
 * @classDef first non repeated character
 */
public class FindFirstNonRepeated {

	static Character firstNonRepeatedChar(String st) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char c:st.toLowerCase().toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		System.out.println(hm);
		for(char c: st.toLowerCase().toCharArray()) {
			if(hm.get(c)==1)
				return c;
		}
		return null;
	}
	
	static Character firstNonRepeatedCh(String st) {
	    return st.toLowerCase().chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	            .entrySet().stream()
	            .filter(e -> e.getValue() == 1)
	            .map(Map.Entry::getKey)
	            .findFirst().orElse(null);
	}

	
	public static void main(String[] args) {
		System.out.println(firstNonRepeatedChar("null"));
		System.out.println("*********");
		System.out.println(firstNonRepeatedCh("Strings"));
	}

}
