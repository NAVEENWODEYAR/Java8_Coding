
package com.coding.map;

import java.util.*;
import java.util.stream.Collectors;

public class MapVsHashMap {
	/**
	 * @author Naveen K Wodeyar LENOVO
	 * @date 03-Jun-202411:08:43 pm
	 * @classDef,  Differences Between Java 8 Map() And flatMap()
	 */
	 static List<Institute> instList = new ArrayList<>(10);
	static {
		instList.add(new Institute("IIT",Arrays.asList("Bombay","Chennai","Karagpur","IIT Delhi")));
		instList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
	}
	
	//names of all institutes,
	static void mapDemo() {
		List<String> list = instList.stream().map(Institute::getInstName).toList();
		System.out.println("Institute names :"+list);
		falatMp();

	}
	
	// Get unique locations of all institutes,
	static void falatMp() {
		 List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
         
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
	          
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
	  
        List<List<Integer>> listOfListofInts =  Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
        
        System.out.println("Before flattening "+listOfListofInts);
        
        List<Integer> collect = listOfListofInts.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println("After flattening "+collect);
	  
	}
	
	
	public static void main(String[] args) {
		mapDemo();
	}
	
	static {falatMp();}

}
