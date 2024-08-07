package com.coding.threads;
/**
 * @author Naveen K Wodeyar 
 * @date 10-Jul-202410:02:53 pm
 * @classDef com.coding
 */
public class Thread1 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t = new Thread1();
		Thread thread = new Thread(t);
		Thread thread1 = new Thread(t);
				thread1.start();
				thread1.join();
				thread.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
