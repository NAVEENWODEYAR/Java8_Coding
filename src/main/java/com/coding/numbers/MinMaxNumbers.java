
package com.coding.numbers;

import java.util.*;
import java.util.stream.Collectors;
/**
 * @author Naveen K Wodeyar 
 * @date 30-May-202412:04:36 am
 * @classDef com.coding
 */
public class MinMaxNumbers {

	static void minMaxInList() {
        List<Integer> intList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        DoubleSummaryStatistics data = intList.stream().collect(Collectors.summarizingDouble(Integer::intValue));
        System.out.printf("\nMinimum number:"+data.getMin(),"\nMaximum number:"+data.getMax());

	}
	public static void main(String[] intArray) {
		minMaxInList();
	}

}
