
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
	
	static boolean prmNo(int n) {
		
		if(n==0 || n ==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=2; i<= n/2; i++) {
			if(n%i==0)
				return false; 
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(primeNo(3));
		System.out.println(prmNo(3));
	}

}
