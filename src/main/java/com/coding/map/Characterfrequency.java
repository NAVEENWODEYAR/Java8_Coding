
package com.coding.map;

import java.util.HashMap;

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
		
	}
	public static void main(String[] args) {
		String st = "Programming";
		charFrequency(st);
	}

}
