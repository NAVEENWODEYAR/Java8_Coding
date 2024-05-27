
package com.coding.arrays;

import java.util.*;
/**
 * @author Naveen K Wodeyar 
 * @date 27-May-202410:57:28 
 * @classDef com.coding
 */
public class NthelementInArrayList {
	
	static void lastelementIndex() {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        			int size = listOfStrings.size()-1;
        			System.out.println(listOfStrings.get(size));
        String lastString = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
        System.out.println(lastString);
	}

	public static void main(String[] args) {
		lastelementIndex();
	}
}
