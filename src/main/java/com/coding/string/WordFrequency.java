
package com.coding.string;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * @author Naveen K Wodeyar LENOVO
 * @date 02-Jun-202412:18:30
 * @classDef com.coding
 */
public class WordFrequency {
    
	static List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

	static void wordFreq() {
		stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
	public static void main(String[] args) {
		wordFreq();
	}

}
