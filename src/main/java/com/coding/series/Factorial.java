package com.coding.series;

import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 15-Jun-202411:06:37 pm
 * @classDef
 */
public class Factorial {

	static int factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return (n* factorial(n-1));
		}
	}
	
	static Long fact(int n) {
//		return LongStream.range(1, n).reduce(1,(a,b)->a*b);
        return LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);

	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(fact(5));
	}

}
