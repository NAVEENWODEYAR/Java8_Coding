
package com.coding.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Naveen K Wodeyar LENOVO
 * @date 28-May-20248:22:33 am
 * @classDef com.coding
 */

public class DateExtractor {

	static void dateExtractor(LocalDate dob) {
		LocalDate now = LocalDate.now();
		Period age = Period.between(dob, now);
        int yearsDifference = Year.now().getValue() - dob.getYear();

		long between = ChronoUnit.YEARS.between(dob, now);
		System.out.println(between+" "+age.getYears()+" "+yearsDifference);
	}
	public static void main(String[] args) {
		dateExtractor(LocalDate.of(1996, 5, 6));
	}

}
