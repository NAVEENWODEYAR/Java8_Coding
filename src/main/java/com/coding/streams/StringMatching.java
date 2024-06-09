
package com.coding.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 08-Jun-202411:38:53 am
 * @classDef com.coding
 */
public class StringMatching {

	static List<String> namesList = Arrays.asList("Ammie","Bella","Clara","Diana");
	static void allMatch() {
		boolean bl = namesList.stream()
                .allMatch(name -> name.length() > 4);
		System.out.println(bl?"True":"False");
	}
	
	public static void main(String[] args) {
		allMatch();
	}

}
