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
		
		for(char c: st.toLowerCase().toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		System.out.println("HashMap "+hm);
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
		Collections.sort(list,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
		System.out.println("Sorted HashMap "+list);
		
		TreeMap<Character, Integer> tm = new TreeMap<>(hm);
		System.out.println("TreeMap "+tm);

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
       
         Map<Object, Object> collect = st.toLowerCase().chars()
        	.mapToObj(c->(char)c)
        	.collect(Collectors.groupingBy(c->c,Collectors.counting()))
        	.entrySet()
        	.stream()
        	.sorted(Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
         System.out.println(collect);
	}
	
	public static void main(String[] args) {
		String st = "Hashmap";
		charFreq(st);
		System.out.println("******");
		charFrequency(st);
	}

}
