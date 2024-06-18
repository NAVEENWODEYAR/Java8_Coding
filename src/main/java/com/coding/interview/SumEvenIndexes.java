package com.coding.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 18-Jun-202412:23:44 pm
 * @classDef program to add only even indexes of an array.
 */
public class SumEvenIndexes {

	static void sumEven() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int i=0; i<arr.length; i+=2) {
			sum = sum+arr[i];
		}
		System.out.println("Array "+Arrays.toString(arr)+" Sum of even indexes "+sum);
	}
	
	static int sumEvenJ8() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		return IntStream.range(0, arr.length).filter(i->arr[i]%2==0).sum();
		
	}
	
	public static void main(String[] args) {
		sumEven();
		System.out.println("\nSum of even indexed elements "+sumEvenJ8());
		
	}

}
