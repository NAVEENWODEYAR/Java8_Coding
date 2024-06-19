package com.coding.interview;

import java.util.Arrays;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-202411:42:39 pm
 * @classDef 
 */
public class AnagramTest {

	static boolean anagramTest(String s1, String s2) {
		return  Stream.of(s1.toLowerCase()
				.split(""))
				.sorted()
				.collect(Collectors.joining())
				.equals(Stream.of(s2.toLowerCase().split(""))
				.sorted()
				.collect(Collectors.joining()));
	}
	
	static boolean anagramTestInString(String s1, String s2) {
		String[] split = s1.split("");
		String[] split2 = s2.split("");
		Arrays.sort(split);
		Arrays.sort(split2);
		return Arrays.equals(split, split2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(anagramTest("Silent", "Listen")?"Anagrams":"Not Anagrams");
		System.out.println(anagramTestInString("the classroom", "school mastern")?"Anagrams":"Not Anagrams");
	}
}
