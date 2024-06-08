
package com.coding.map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 08-Jun-20249:42:14 pm
 * @classDef find the second non-repeating element in an array using
 */
public class SecondNonRepeatingElement {
		static Optional<Integer> secondNonRepeatingNo(int[] arr) {
			Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
			List<Integer> list = Arrays.stream(arr).boxed().filter(e->collect.get(e) ==1).distinct().toList();
			return list.size() > 1? Optional.of(list.get(1)):Optional.empty();
		}
	
	    public static void main(String[] args) {
	        int[] arr = {4, 5, 4, 5, 8, 3, 2, 1, 2, 3, 6}; // Example array
	        Integer result = secondNonoRepeatedElement(arr);
	        System.out.println(secondNonRepeatingNo(arr));
	        if (result != null) {
	            System.out.println("The second non-repeating element is: " + result);
	        } else {
	            System.out.println("There are not enough non-repeating elements in the array.");
	        }
	    }
	    
	    static Integer secondNonoRepeatedElement(int arr[]) {
	    	Map<Integer, Integer> hm = new HashMap<>();
	    	
	    	for(int i: arr) {
	    		hm.put(i,hm.getOrDefault(i, 0)+1);
	    	}
	    	 int nonRepeatingEle = 0;
	    	 
	    	 for(int i:arr) {
	    		 if(hm.get(i) ==1) {
	    			 nonRepeatingEle++;
	    			 if(nonRepeatingEle == 2) {
	    				 return i;
	    			 }
	    		 }
	    	 }
	    	return null;
	    }
	}

