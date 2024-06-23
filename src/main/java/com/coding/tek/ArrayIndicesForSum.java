package com.coding.tek;

import java.util.*;

/**
 * @author Naveen K Wodeyar 
 * @date 24-Jun-202412:00:04 am
 * @classDef com.coding
 */
public class ArrayIndicesForSum {

	static int[] getIndicesArray(int[]arr,int sum) {
	
		HashMap<Integer, Integer> hashMap = new HashMap<>();
	
		for(int i=0; i<arr.length; i++) {
			int complemet = sum - arr[i];
			if(hashMap.containsKey(complemet)) {
				return new int[] {hashMap.get(complemet),i};
			}
			hashMap.put(arr[i], i);
		}
		throw new IllegalArgumentException("Not indices found");
	}
	
	
	static int[] twoSum(int arr[], int sum) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(hashMap.containsKey(sum-arr[i])) {
				return new int[] {hashMap.get(sum-arr[i]),i};
			}
			hashMap.put(arr[i], i);
		}
		throw new IllegalArgumentException("No sum found");
	}
	
	public static void main(String[] args) {
		// Test cases
        int[] result1 = getIndicesArray(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");  // Output: [0, 1]

        int[] result2 = getIndicesArray(new int[] {3, 2, 4}, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");  // Output: [1, 2]

        int[] result3 = getIndicesArray(new int[] {3, 3}, 6);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");  // Output: [0, 1]
        
        System.out.println(java.util.Arrays.toString(twoSum(new int[] {2, 7, 11, 15}, 9)));  // Output: [0, 1]
        System.out.println(java.util.Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)));       // Output: [1, 2]
        System.out.println(java.util.Arrays.toString(twoSum(new int[] {3, 3}, 6))); 
	}

}
