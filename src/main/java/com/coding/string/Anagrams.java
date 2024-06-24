package com.coding.string;

import java.util.stream.*;
/**
 * @date 26/05/2024 16:26PM
 * @apiNote Java 8 program to check if two strings are anagrams or not
 * Two strings are anagrams if they contain the same characters with the same frequency,
 */
public class Anagrams {

	static void anagramTest() {	
		 String s1 = "RaceCar",s2="CarRace";

		 boolean equals = Stream.of(s1.toLowerCase().split(""))
		 		.sorted().collect(Collectors.joining())
		 		.equals(Stream.of(s2.toLowerCase().split("")).sorted()
		 				.collect(Collectors.joining()));
		 System.out.println(equals?"True":"False");
	}
	public static void main(String[] args) {
		anagramTest();
	}

}
