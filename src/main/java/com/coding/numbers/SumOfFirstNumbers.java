
package com.coding.numbers;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 27-May-202410:06:49 pm
 * @classDef com.coding
 */

public class SumOfFirstNumbers {
	
	static Integer sumOfNumbers() {
		return IntStream.range(1, 10).sum();
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfNumbers());
	}

}
