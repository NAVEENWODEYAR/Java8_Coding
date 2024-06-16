package com.coding.arrays;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 16-Jun-202411:51:08 pm
 * @classDef com.coding
 */
	public class BinarySearch {
	    public static int binarySearch(int[] arr, int low, int high, int key) {
	        int mid;
	        while (low <= high) {
	            mid = (low + high) / 2;
	            if (arr[mid] < key) {
	                low = mid + 1;
	            } else if (arr[mid] == key) {
	                return mid;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return -1; 
	    }

	    static int binarySrch(int[] arr,int key) {
	    	return IntStream.rangeClosed(0, arr.length-1).filter(i->arr[i]==key).findFirst().getAsInt();
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
	        int key = 7;
	        int result = binarySearch(arr, 0, arr.length - 1, key);
	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	        System.out.println("\n************\n");
	        System.out.println(binarySrch(arr, key));
	    }
	}
