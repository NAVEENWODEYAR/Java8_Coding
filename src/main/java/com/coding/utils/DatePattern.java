
package com.coding.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Naveen K Wodeyar 
 * @date 17-Jun-20249:56:11 pm
 * @classDef com.coding
 */
public class DatePattern {

	static void datePattern() {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println(sdf.format(new Date()));
	}
	
	public static void main(String[] args) {
		datePattern();
	}

}
