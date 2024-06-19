package com.coding.interview;
/**
 * @author Naveen K Wodeyar 
 * @date 19-Jun-202411:48:29 am
 * @classDef com.coding
 */
public class SingleTonClass {

	private static SingleTonClass instance = null;
	
	private SingleTonClass() {}
	
	   public static synchronized SingleTonClass getInstance() {  
		   if (instance == null) {  
		   instance = new SingleTonClass();  
		   }  
		   return instance;  
		   } 
}
