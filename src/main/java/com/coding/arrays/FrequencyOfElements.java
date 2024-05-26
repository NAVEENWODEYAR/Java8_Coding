
package com.coding.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 26-May-20244:11:55 pm
 * @classDef find frequency of each element in an array or a list,
 */
public class FrequencyOfElements {

	static void freqInArrList() {
        List<String> strList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
	public static void main(String[] args) {
		freqInArrList();
	}
	

}
