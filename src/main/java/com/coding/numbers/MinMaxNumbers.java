
package com.coding.numbers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author Naveen K Wodeyar 
 * @date 30-May-202412:04:36 am
 * @classDef com.coding
 * @apiNote Anagram is a word or phrase that is formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once. 
 * 			It must have the same letters in the same frequency but can be in a different order.
 */
public class MinMaxNumbers {

	static void minMaxInList() {
        List<Integer> intList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        DoubleSummaryStatistics data = intList.stream().collect(Collectors.summarizingDouble(Integer::intValue));
        System.out.printf("Minimum number: %.0f, Maximum number: %.0f", intList.stream().collect(Collectors.summarizingDouble(Integer::intValue)).getMin(), intList.stream().collect(Collectors.summarizingDouble(Integer::intValue)).getMax());
	}
	
	static void anagramTest() {
		String s1 = "Listen", s2 = "Silent";
		boolean equals = Stream.of(s1.toUpperCase().split("")).sorted().collect(Collectors.joining()).equals(Stream.of(s2.toUpperCase().split("")).sorted().collect(Collectors.joining()));
		System.out.println(equals?"True":"False");	
		
	}
	
	public static void main(String[] intArray) {
		minMaxInList();
	}

}
