package com.coding.interview;

import java.util.Arrays;
/**
 * @author Naveen K Wodeyar 
 * @date 19-Jun-202411:34:12 pm
 * @classDef Find the maximum element in an unsorted array
 */
public class MaximumElementInArray {

	static void maxElement(int arr[]) {
		int maxEle = Arrays.stream(arr).max().getAsInt();
		System.out.println(Arrays.toString(arr)+", maximum value in the array->"+maxEle+"\n");
		
		int max = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		maxElement(new int[] {2,4,1,5,8,6,-1});
	}

}
