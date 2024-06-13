
package com.coding.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naveen K Wodeyar 
 * @date 14-Jun-202412:04:32
 * @classDef com.coding
 */
public class OddNumberCheck {

	static boolean oddCheck(int num) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		boolean anyMatch = intList.parallelStream().anyMatch(n->n%2 !=0);
		
		return num%2==0;
	}
	public static void main(String[] args) {
		System.out.println(oddCheck(3)?"Eveen":"Odd");
	}

}
