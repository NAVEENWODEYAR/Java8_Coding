package com.coding.streams;

import java.util.*;
/**
 * @author Naveen K Wodeyar 
 * @date 29-Jun-20248:59:21 pm
 * @classDef com.coding
 */
public class TreamOperations {

	static void stremOperations() {
		List<String> intList = Arrays.asList("Ammie","Nora","Bella","Clara","Diana","Kelly","Emma","Florence","Gennie","Helen","Anna","Bailey","Cathy");

		System.out.println("\nList "+intList);
        Collections.sort(intList, Comparator.comparingInt(String::length));
        System.out.println("\nSorted list "+intList);
        
		// intermediate functions,
		List<String> sortedList = intList.stream().sorted(Comparator.comparing(String::length)).toList();
		System.out.println(sortedList);
		
        Collections.sort(intList, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println(intList);
        
        // filtering,
        List<String> filteredList = intList.stream().filter(s->s.length()> 5).sorted().toList();
        System.out.println("\n Filtered list "+filteredList);
        
        List<String> nthElement = intList.stream().sorted(Comparator.comparing(String::length)).skip(2).limit(1).toList();
        System.out.println("\nNth Element "+nthElement);
	}
	
	public static void main(String[] args) {
		stremOperations();
	}
}
