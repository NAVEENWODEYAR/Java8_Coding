package com.coding.threads;
/**
 * @author Naveen K Wodeyar 
 * @date 11-Jul-20248:00:33 am
 * @classDef Lambda expressions provide a concise way to create instances of functional interfaces, including Runnable.
 */
public class ThreadUsingLambda {

	static void threadUsingLambda() {
		Runnable runnable = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+","+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(runnable);
				thread.start();
	}
	
	public static void main(String[] args) {
		Runnable runnable = ()-> {
			threadUsingLambda();
			System.out.println("\n**********\n");
			System.out.println(Thread.currentThread().getName());};
		Thread thread = new Thread(runnable);
				thread.start();
	}

}
