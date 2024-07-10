package com.coding.threads;

import java.util.Iterator;

/**
 * @author Naveen K Wodeyar 
 * @date 10-Jul-202410:02:53 pm
 * @classDef com.coding
 */
public class Thread1 implements Runnable {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		Thread thread = new Thread(t);
		Thread thread1 = new Thread(t);
				thread1.start();
				thread.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
