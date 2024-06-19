package com.coding.interview;
/**
 * @author Naveen K Wodeyar 
 * @date 19-Jun-202411:47:41 am
 * @classDef com.coding
 */
public class SingleTonClassImpl {

	public static void main(String[] args) {

		SingleTonClass s1 = SingleTonClass.getInstance();
		SingleTonClass s2 = SingleTonClass.getInstance();
		
		if(s1.equals(s2)) {
			System.out.println("Both objects are same");
		}
		System.out.println(s1.hashCode()+"-"+s2.hashCode());
	}
}
