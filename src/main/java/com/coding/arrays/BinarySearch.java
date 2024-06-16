package com.coding.arrays;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 16-Jun-202411:51:08 pm
 * @classDef com.coding
 */
public class BinarySearch {
	static int binarySearch(int[] arry ,int low, int high, int key) {
		int mid = (low+high)/2;
		
		if(low <= high) {
			if(arry[mid] < key) {
				low = mid+1;
			}else if(arry[mid] == key) {
				return mid;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
		}
		if(low >high) {
			return -1;
		}
		return -1;
	}
	
	public static void main(String[] args) {

	}
}
