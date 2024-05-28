
package com.coding.numbers;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar 
 * @date 27-May-202410:16:12 pm
 * @classDef com.coding
 */
public class FirstTenEvenNumbers {

	static void oddNumbers() {
		IntStream.iterate(1, n->n+2).limit(10).forEach(System.out::println);
	}
	public static void main(String[] args) {
		oddNumbers();
		}
	}
