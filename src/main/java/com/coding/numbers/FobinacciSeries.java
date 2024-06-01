
package com.coding.numbers;

import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 01-Jun-202411:23:55 pm
 * @classDef com.coding
 */
public class FobinacciSeries {

	static void fiboSeries() {
		Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(i->System.out.println(i+" "));
	}
	
	public static void main(String[] args) {
		fiboSeries();
	}

}
