
package com.coding.map;

import java.util.*;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar 
 * @date 04-Jun-202411:52:21 pm
 * @classDef, Collecting Nested Arrays into a Single List
 */
public class FlatMapEx {

	static String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
	
	static List flatMp() {
		nestedList();
		return Arrays.stream(dataArray).flatMap(arr->Arrays.stream(arr)).collect(Collectors.toList());
	}
	
	static List nestedList() {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> list =  Arrays.asList(list1,list2,list3);
		System.out.println("Sum of the given list "+sumOfList());
		return list.stream().flatMap(lis->list.stream()).collect(Collectors.toList());
	}
	
	static Integer sumOfList() {
		List<List<Integer>> listOfLists = Arrays.asList(
				  Arrays.asList(1, 2, 3),
				  Arrays.asList(4, 5),
				  Arrays.asList(6, 7, 8));
		Stream<Integer> map = listOfLists.parallelStream().map(list->list.stream().mapToInt(Integer::intValue).sum());
		map.forEach(System.out::println);
		return listOfLists.stream().flatMap(list->list.stream()).mapToInt(Integer::intValue).sum();
	}
	
	public static void main(String[] args) {
//		System.out.println(flatMp());
		sumOfList();
	}

}
