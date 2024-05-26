
package com.coding.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @date 26/05/2024
 * @apiNote  finding frequency of each character in a string using Java 8 streams,
 */
public class CharacterFrequency {

	static void charFreq() {
        String str = "Java Concept Of The Day";
        		str.chars().filter(c->c != ' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
        		Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		charFreq();
	}
}
