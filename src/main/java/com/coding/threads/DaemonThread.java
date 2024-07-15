package com.coding.threads;
/**
 * @author Naveen K Wodeyar 
 * @date 15-Jul-20247:35:54 pm
 * @classDef com.coding
 */
public class DaemonThread {
	  public static void main(String[] args) {
	        // Create a user thread
	        Thread userThread = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("User thread running: " + i);
	                try {
	                    Thread.sleep(1000); // Sleep for 1 second
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        // Create a daemon thread
	        Thread daemonThread = new Thread(() -> {
	            while (true) {
	                System.out.println("Daemon thread running in background...");
	                try {
	                    Thread.sleep(500); // Sleep for 0.5 seconds
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        daemonThread.setDaemon(true); // Set the thread as a daemon thread

	        userThread.start();
	        daemonThread.start();

	        try {
	            userThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread ending, JVM will exit if no other user threads are running.");
	    }
}
