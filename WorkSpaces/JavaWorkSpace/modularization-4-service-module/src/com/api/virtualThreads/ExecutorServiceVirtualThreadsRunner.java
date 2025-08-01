package com.api.virtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceVirtualThreadsRunner {

	// Virtual threads run on top of small pool of Os Threads
	// Virtual threads are managed by JVM
	// can create millions of lightweight threads without high memory usage

	// Creating virtual thread using executor service is resource friendly
	// Executor Service is preferred way to launch short lived tasks
	public static void main(String[] args) {
		ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(i);
			// Thread.startVirtualThread(new SleepingThread());
			executor.execute(new SleepingThread());
		}
		executor.shutdown();
	}

}
