
package com.coding.series;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jun-202411:14:02 pm
 * @classDef com.coding
 */
public class PrimeNumber {

	static boolean primeNo(int n) {
		return n>1 && IntStream.range(2, (int)Math.sqrt(n)).noneMatch(a->n%a==0);
	}
	public static void main(String[] args) {
		System.out.println(primeNo(3));
	}

}
