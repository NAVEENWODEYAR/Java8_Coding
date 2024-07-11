package com.coding.threads;

import java.util.concurrent.*;
/**
 * @author Naveen K Wodeyar LENOVO
 * @date 11-Jul-20248:13:26 am
 * @classDef ExecutorService provides a high-level API for creating and managing threads.
 */
public class ThreadUsingExecutorService {

	static void executorService() {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			service.execute(()->{System.out.println(Thread.currentThread().getName());});
		}
		service.shutdown();
	}
	
	public static void main(String[] args) {
		executorService();
	}

}
