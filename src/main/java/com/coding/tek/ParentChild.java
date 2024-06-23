package com.coding.tek;
/**
 * @author Naveen K Wodeyar 
 * @date 23-Jun-202411:49:06 pm
 * @classDef com.coding
 */
public class ParentChild {

	public static void main(String[] args) {

			A a = new A();
			a.draw();
			
			A a1 = new B();
			a1.draw();
			
			B b = new B();
			b.draw();
			
//			B b1 = new A();
//			b1.draw();
	}
}


class A{
	void draw(){
		System.out.println("Class A");
	}
}
class B extends A{
	void draw(){
		System.out.println("Class B");
	}
}
