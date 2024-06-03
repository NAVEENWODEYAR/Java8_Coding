
package com.coding.map;

import java.util.*;
import java.util.stream.*;

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
    instList.stream().flatMap(institute -> institute.getLocations().stream()).collect(Collectors.toSet());

		System.out.println("Instituet address :");
	}
	
	
	public static void main(String[] args) {
		mapDemo();
	}

}
