
package com.coding.streams;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 05-Jun-202412:12:23 am
 * @classDef, stream selection Operations
 */
public class StremOperations {
	
	static List<String> list = Arrays.asList("One","Two","Three","Four");
	// filter(),
	static List filterStream() {
		return list.stream().filter(n->n.length() >=4).toList();
	}
	
	public static void main(String[] args) {
		System.out.println(filterStream());
	}

}
