
package com.coding.map;

import java.util.HashMap;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 11-Jun-20249:53:42 pm
 * @classDef com.coding
 */
public class HashMp {

	static void hashMpCreationWays() {
		// 1. default initial capacity(16) & loadfactor(.75),
		HashMap<Object, Object> hashMap = new HashMap<>();
		
		// 2. default initial custom capacity ,40
		HashMap<Object, Object> hashMap1 = new HashMap<>(40);
		
		// 3. default initial capacity(16) & loadfactor(10),
		HashMap<Object, Object> hashMap2 = new HashMap<>(20,10);
		
		// 4. default initial capacity(16) & loadfactor(),
		HashMap<Object, Object> hashMap3 = new HashMap<>(hashMap);
		
		System.out.println(hashMap);
	}
	public static void main(String[] args) {
		hashMpCreationWays();
	}

}
