package com.Threadingconcepts;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallerRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		callableRunnerTask();
	}

	private static void callableRunnerTask() throws InterruptedException, ExecutionException {
		ExecutorService eS = Executors.newFixedThreadPool(3);

		List<CallableTask> cTL = List.of(new CallableTask("Venky"), new CallableTask("Deepika"),
				new CallableTask("Pranav"), new CallableTask("Kishan"));

		String result = eS.invokeAny(cTL);
		System.out.println(result);

		eS.shutdown();
	}
}