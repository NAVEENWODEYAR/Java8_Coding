
package com.coding.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 04-Jun-202411:52:21 pm
 * @classDef, Collecting Nested Arrays into a Single List
 */
public class FlatMapEx {

	static String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
	
	static List flatMp() {
		return Arrays.stream(dataArray).flatMap(arr->Arrays.stream(arr)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(flatMp());
	}

}
