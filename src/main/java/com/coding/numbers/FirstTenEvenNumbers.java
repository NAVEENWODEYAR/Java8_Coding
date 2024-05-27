
package com.coding.numbers;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar 
 * @date 27-May-202410:16:12 pm
 * @classDef com.coding
 */
public class FirstTenEvenNumbers {

	public static void main(String[] args) {
		IntStream.range(1, 10).map(n->n*2).forEach(System.out::println);
	}

}
