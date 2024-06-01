
package com.coding.arrays;
import java.util.*;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 01-Jun-20245:42:31 pm
 * @classDef com.coding
 */
	public class DigitInString {

		static List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

		static void startsWithDigit() {
			List<String> list = listOfStrings.stream().filter(s->(Character.isDigit(s.charAt(0)))).toList();
			System.out.println(list);
		}
		
	public static void main(String[] args) {
		startsWithDigit();
	}

}
