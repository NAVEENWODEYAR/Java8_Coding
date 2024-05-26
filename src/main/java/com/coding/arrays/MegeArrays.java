
package com.coding.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar,
 * @date 25-05-2024,
 */
public class MegeArrays {
	
	static void mergeArrays() {
		int[] a = new int[] {4, 2, 7, 1,2,4,2,9};
        int[] b = new int[] {8, 3, 9, 5,9,2,4,5};
        
        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(array));
		
	}
	
	public static void main(String[] args) {
		mergeArrays();
	}
}
