package com.coding.interview;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar 
 * @date 20-Jun-202412:19:22 am
 * @classDef com.coding
 */
public class MinimumSubarraySumJava {

	 public static int findMinSubarraySum(int[] arr, int k) {
	        int minSum = Arrays.stream(arr, 0, k).sum();
	        int currentSum = minSum;

	        for (int i = k; i < arr.length; i++) {
	            currentSum += arr[i] - arr[i - k];
	            minSum = Math.min(minSum, currentSum);
	        }

	        return minSum;
	 }
	 public static void main(String[] args) {
	        int[] arr = {3, 7, 90, 20, 10, 50, 40};
	        int k = 3;

	        int minSubarraySum = findMinSubarraySum(arr, k);
	        System.out.println("Minimum sum of a subarray of size " + k + ": " + minSubarraySum);
	    }
}
