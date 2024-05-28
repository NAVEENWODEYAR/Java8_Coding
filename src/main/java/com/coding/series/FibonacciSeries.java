
package com.coding.series;

import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 28-May-202411:27:06 pm
 * @classDef com.coding
 * @apiNote 
 */
public class FibonacciSeries {
	static void fiboSeries() {
		Stream.iterate(new int[] {0,1}, f-> new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		fiboSeries();
	}
}
