// USING the  --- Extends Thread approach

package com.Threadingconcepts;

class Task1 extends Thread { // Using the extends Threads approach to implement threading
	@Override
	public void run() {
		System.out.println("Task 1 STARTED");
		for (int i = 100; i < 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 1 DONE");
	}
}

class Task2 implements Runnable { // using the Implements Runnable approach to implement threading

	@Override
	public void run() {
		System.out.println("Task 2 STARTED");
		for (int i = 201; i < 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 2 DONE");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		// Calling the task 1 class
		Task1 task = new Task1();
		// task.run();// This is not threading when the run method is called it will be
		// a regular method call
		task.start(); // using the start() is the way to run the task as a thread.

		Task2 t2 = new Task2();
		Thread t2Thread = new Thread(t2);
		t2Thread.setPriority(1); // 1-Least priority 5-Normal Priority 10-High Priority
									// (May or may not be honoured)
		t2Thread.start();

		// Wait for task1 to complete before proceeding further
		task.join();

		System.out.println("Task 3 Kicked Off");
		for (int i = 400; i < 500; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task 3 DONE");
	}

}
