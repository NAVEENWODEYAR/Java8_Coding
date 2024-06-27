package com.coding.arrays;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 27-Jun-202411:40:59 am
 * @classDef com.coding
 */
public class ArrayCopy {

	static void initializeArray() {
		try {
		// Using Array Literals,
		String names[] = new String[] { "One", "Two", "Three", "Four", "Five" };
		names[5] = "Six"; // ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(names));

		// Using the new Keyword,
		int[] arr = new int[5];
		for (int i = 0; i <= arr.length; i++) {
			arr[i] = i;
		}
		System.out.println("\n" + Arrays.toString(arr));

		int[][] arr1 = new int[4][4];
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		arr1[0][2] = 3;
		arr1[1][0] = 1;
		arr1[1][1] = 2;
		arr1[1][2] = 3;
		arr1[2][0] = 1;
		arr1[2][1] = 2;
		arr1[2][2] = 3;
		System.out.println(Arrays.toString(arr1));

		// Using Array Copy Methods, Using Arrays.copyOf()
		String[] names2 = Arrays.copyOf(names, names.length);
		String names3[] = new String[names2.length];
		System.arraycopy(names, 0, names3, 0, names.length);
		System.out.println(Arrays.toString(names2) + "\n" + Arrays.toString(names3));

		// Using streams,
		int[] intArr = IntStream.rangeClosed(0, 5).toArray();
		System.out.println("\nArray " + Arrays.toString(intArr));

		// Using collections,
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer[] array = intList.toArray(new Integer[0]);
		System.out.println("\nArrayList " + intList + "\n Array: " + Arrays.toString(array));

		// Using Arrays.fill() Method,
		int num[] = new int[10];
		Arrays.fill(num, 10);
		System.out.println("\nArrays.fill() "+num);
		
		//Using Anonymous Arrays (Initialization Block)
		int anonymous[];
		anonymous = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(anonymous));


		copyArray(intArr);
		}
		catch(Exception e) {
			System.out.println(e.getCause());
		}
	}
	
	static void copyArray(int[] arr) {
		//System.arraycopy(),
		int arr1[] = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		System.out.println("\n Original array "+Arrays.toString(arr)+"\nCopied array "+Arrays.toString(arr1));
		
		//Arrays.copyOf()
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("\n Copied array "+Arrays.toString(arr2));
		
		//clone(),
		int arr3[] = arr2.clone();
		System.out.println("\nCloned array "+Arrays.toString(arr3));
		
		//Arrays.copyOfRange(),
		int[] arr4 = Arrays.copyOfRange(arr3, 0, arr3.length);
		System.out.println("\nCopied array "+Arrays.toString(arr4));
		
	}

	public static void main(String[] args) {
		initializeArray();
	}
}
