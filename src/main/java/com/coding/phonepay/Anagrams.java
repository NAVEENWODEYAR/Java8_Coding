package com.coding.phonepay;

import java.util.Arrays;
import java.util.stream.*;
/**
 * @author Naveen K Wodeyar 
 * @date 24-Jun-202410:49:01 pm
 * @classDef com.coding
 */
public class Anagrams {

	static boolean anagramTest(String s1, String s2) {
		String[] split = s1.split("");
		String[] split2 = s1.split("");
		
		Arrays.sort(split);
		Arrays.sort(split2);
		
		return Arrays.equals(split, split2);
	}
	
	static boolean anagramJ8(String s1, String s2) {
		Stream<String> sorted = Stream.of(s1.split("")).sorted();
		return Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.joining()).equals(Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.joining()));
	}
	
	static boolean anagramLoop(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		for(int i=0; i<a1.length; i++) {
			if(a1[i] !=a2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(anagramTest("heart", "earth")?"Anagrams":"Not Anagrams");
		System.out.println(anagramJ8("heart", "earth")?"Anagrams":"Not Anagrams");
		System.out.println(anagramLoop("Silent", "listen")?"Anagrams":"Not Anagrams");
	}
}
