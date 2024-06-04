
package com.coding.streams;

import java.util.Arrays;
import java.util.stream.Stream;

import com.coding.map.Institute;

/**
 * @author Naveen K Wodeyar 
 * @date 04-Jun-202411:38:42 pm
 * @classDef, Streams a sequences of elements from a source which support data processing operations
 */
public class StreamOperations {

	static void streamOerations(){
		Stream st = Stream.of();
		Stream<Institute> str = Stream.of(new Institute("St", Arrays.asList("S","T")));
		Stream stream = Stream.of(1,2,3,4,5,6,78,98);
	}
	public static void main(String[] args) {

	}

}
