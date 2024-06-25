package com.coding.phonepay;

import java.util.*;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar 
 * @date 24-Jun-202411:09:46 pm
 * @classDef Find the maximum element in an unsorted array
 */
public class MaxelementInArray {

	static int maxElement(int arr[]) {
		return Arrays.stream(arr).boxed().collect(Collectors.maxBy(Comparator.comparing(Integer::intValue))).get();
	}
	
	static int maxElementInLoop(int[] arr) {
		int max=0;
		int[] newArray = Arrays.copyOf(arr, arr.length);
		Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Integer min = Collections.min(Arrays.asList(integerArray));
		Integer max2 = Collections.max(Arrays.asList(integerArray));
		for(int i:arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {9,2,1,4,3,5,6,8,};
		System.out.println(maxElement(arr));
		System.out.println(maxElementInLoop(arr));
	}

}
