
package com.coding.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 05-Jun-202412:12:23 am
 * @classDef, stream selection Operations
 */
public class StremOperations {
	
	static List<String> list = Arrays.asList("One","Two","Three","Four","Five","One","Two","Three");
	// filter(),
	static List filterStream() {
		return list.stream().filter(n->n.length() >=4).toList();
	}
	
	// distinct() : selects only unique elements
	static List distint() {
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	// mapping operations
	static void mapFn() {
		List<String> strList = Arrays.asList("One","Two,Three","Four","Five");
		strList.stream().collect(Collectors.toMap(st->st,st->st.length())).entrySet().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		System.out.println(filterStream());
		System.out.print(distint());
		mapFn();
	}

}
