package com.coding.tek;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naveen K Wodeyar 
 * @date 24-Jun-202412:25:28 am
 * @classDef com.coding
 */
public class NumberProcessing {

	/** Filter out the even numbers from the list,*/
	static List<Integer> evenNumbers(List<Integer> intList) {
		return intList.stream().filter(n->n%2 !=0).toList();
	}
	
	/**Double each of the remaining odd numbers,*/
	static void doubleReminingnumbers(List<Integer> intList) {
		List<Integer> list = intList.stream().filter(n-> n%2 !=0).toList();
		List<Integer> doubledList = list.stream().map(n->n*2).toList();
		int sum = doubledList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Doubled list "+doubledList+" sum "+sum);
	}
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(evenNumbers(intList));
		System.out.println("***********");
		doubleReminingnumbers(intList);
		System.out.println("\n"+sumOfDoubledOdds(intList));
		
	}
	
	static int sumOfDoubledOdds(List<Integer> intList) {
		return intList.stream().filter(n-> n%2 !=0)
						.map(n-> n*2)
						.reduce(0,Integer::sum);
		
	}

}
