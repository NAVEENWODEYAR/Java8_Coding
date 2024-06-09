
package com.coding.series;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 28-May-202411:27:06 pm
 * @classDef com.coding
 * @apiNote 
 */
public class FibonacciSeries {
	static void fiboSeries() {
		Stream.iterate(new int[] {0,1}, n-> new int[] {n[1],n[0]+n[1]}).limit(10).map(n->n[0]).forEach(i-> System.out.print(i+","));
	}
	
	static void dateCalci(LocalDate date) {
		LocalDate now = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(date, now));
	}
	
	public static void main(String[] args) {
		fiboSeries();
		dateCalci(LocalDate.of(1996,05,06));
	}
}
