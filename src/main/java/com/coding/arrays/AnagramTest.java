/**
 * @author Naveen K Wodeyar LENOVO
 * @date 30-May-202411:42:55 pm
 * @classDef com.coding
 * @apiNote Anagram is a word or phrase that is formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once. 
 */
package com.coding.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class AnagramTest {
	static String s1 = new String("Study");
	static String s2 = new String("Dusty");
	
	static void anagramTest(String s1,String s2) {
	Boolean anagram = s1.length() == s2.length() && s1.chars().map(Character::toUpperCase).sorted().toArray().equals(s2.chars().map(Character::toUpperCase).sorted().toArray());
		System.out.println(anagram?"Anagram":"Not anagram\n"+" "+anagramTest1());
	}
	
	static Boolean anagramTest1() {
		return Arrays.equals(Stream.of(s1.toLowerCase()).sorted().toArray(),Stream.of(s2.toLowerCase()).sorted().toArray());
	}

	public static void main(String[] args) {
		anagramTest(s1, s2);
	}

}
