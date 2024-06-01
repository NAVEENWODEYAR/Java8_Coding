
package com.coding.arrays;
import java.util.*;
import java.util.stream.Collectors;
/**
 * @author Naveen K Wodeyar LENOVO
 * @date 01-Jun-20248:19:17 pm
 * @classDef, extract duplicate elements from an array,
 */
public class DuplicatesInArray {
    static List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

    static void extractDuplicates() {
        Set<Integer> uniqueElements = new HashSet<>();

    	 Set<Integer> collect = listOfIntegers.stream().filter(i->!uniqueElements.add(i)).collect(Collectors.toSet());
    	System.out.println(collect);
    }
	public static void main(String[] args) {
		extractDuplicates();
	}

}
