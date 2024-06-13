
package com.coding.map;

import java.util.*;

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
		
		hashMap.put(hashMap2, hashMap3);
		hashMap1.putAll(hashMap);
		hashMap2.put(1, 0.1f);
		hashMap3.put(new HashMp().toString(), Arrays.asList("One","2"));
		
		System.out.println(hashMap+"\n"+hashMap1+"\n"+hashMap2+"\n"+hashMap3);
		System.out.println(hashMap.containsKey("Two")+"--"+hashMap2.containsValue(hashMap));
		System.out.println("**************");
		hashMap.clear();
		hashMap1.clear();
		hashMap2.clear();
		hashMap3.clear();
		System.out.println(hashMap+"\n"+hashMap1+"\n"+hashMap2+"\n"+hashMap3);
		System.out.println(hashMap.containsKey("Two")+"--"+hashMap2.containsValue(hashMap));

	}
	public static void main(String[] args) {
		hashMpCreationWays();
	}

}
