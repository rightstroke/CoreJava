package com.rsc.src.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MyExecSubmission02 {
	
	public void doSubmission() throws InterruptedException, ExecutionException {
		ExecutorService exec = Executors.newFixedThreadPool(10);
		
		Future<?> result = exec.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("My Task");
			}
		});
		result.get();
		
		exec.shutdown();
		
		exec.awaitTermination(10, TimeUnit.SECONDS);
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		new MyExecSubmission02().doSubmission();
	}

}
