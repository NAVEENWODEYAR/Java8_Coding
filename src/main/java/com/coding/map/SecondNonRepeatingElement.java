
package com.coding.map;

import java.util.HashMap;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 08-Jun-20249:42:14 pm
 * @classDef find the second non-repeating element in an array using
 */
public class SecondNonRepeatingElement {

	static int arr[] = {1,2,3,3,4,5,2,6,7,8,9};
	
	static int secondNonRepeatingElement(int[] arr) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i:arr) {
			hm.put(i,hm.getOrDefault(i,0)+1);
		}
		 int nonRepetingEle = 0;
		 
		 for(int i: arr) {
			 if(nonRepetingEle == 1) {
				 nonRepetingEle++;
				 if(nonRepetingEle == 2) {
					 return i;
				 }
			 }
		 }
		return nonRepetingEle;
	}
	public static void main(String[] args) {
		System.out.println(secondNonRepeatingElement(arr));
	}

}
