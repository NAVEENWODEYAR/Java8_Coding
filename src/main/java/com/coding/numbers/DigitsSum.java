
package com.coding.numbers;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 31-May-202412:02:54 am
 * @classDef com.coding
 */

public class DigitsSum {
	static Integer a = 12345;
	
	static Integer sumOfDigits() {
		return Stream.of(String.valueOf(a).split("")).collect(Collectors.summingInt(Integer::parseInt));
	}
	public static void main(String[] args) {
		System.out.println("\n"+sumOfDigits());
	}

}
