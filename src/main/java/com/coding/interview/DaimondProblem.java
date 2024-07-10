package com.coding.interview;
/**
 * @author Naveen K Wodeyar LENOVO
 * @date 10-Jul-20247:49:04 am
 * @classDef com.coding
 */
//public class DaimondProblem extends A,B {
	public class DaimondProblem implements C,D {

	public static void main(String[] args) {
		DaimondProblem d = new DaimondProblem();
						d.test();
	}

	@Override
	public void test() {
		System.out.println("\nMethod implementation!");
	}

}

 class A{
	 public void test() {System.out.println("\nClass A");}
}
 class B{
	 public void test() {System.out.println("\nClass B");}
}
 
 interface C{
	 void test();
 }
 
 interface D{
	 void test();
 }