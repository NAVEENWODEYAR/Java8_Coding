package com.coding.interview;

import java.util.*;

/**
 * @author Naveen K Wodeyar 
 * @date 25-Jun-202410:37:12 am
 * @classDef com.coding
 */
public class RotateArray {

	static List<Integer> rotateArray(int arr[],int k) {
		
		// Method 1: Using a loop to add elements to ArrayList
		List<Integer> arrayList1 = new ArrayList<>();
		for(int i:arr) {
			arrayList1.add(i);
		}
		
	     // Method 2: Using Java 8 Streams
		List<Integer> arrayList12 = new ArrayList<>();
		Arrays.stream(arr).forEach(arrayList12::add);
		
        // Method 3: Using Arrays.asList (returns a fixed-size list)
		List<Integer> arrayList3 = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
		Collections.rotate(arrayList3, k);
		
		return arrayList3;
	}
	
	static void rotateArrayLoop(int nums[],int k) {
		int n = nums.length;
        k = k % n; // In case the steps are greater than array length
        if (k == 0) return; // No rotation needed

        // Create a new array to hold the rotated result
        int[] rotated = new int[n];
        
        // Copy the last k elements to the beginning of the rotated array
        for (int i = 0; i < k; i++) {
            rotated[i] = nums[n - k + i];
        }
        
        // Copy the rest of the elements
        for (int i = k; i < n; i++) {
            rotated[i] = nums[i - k];
        }
        System.out.println(Arrays.toString(rotated));
        
        // Copy the rotated array back to the original array
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
		
	}
	 
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		List<Integer> rotateArray = rotateArray(arr, k);
		Object[] array = rotateArray.toArray();
		System.out.println(Arrays.toString(array));
		System.out.println(rotateArray(arr, k));
		System.out.println("*******");
		rotateArrayLoop(arr, k);
	}

}
