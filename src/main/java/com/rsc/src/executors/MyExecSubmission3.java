package com.rsc.src.executors;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MyExecSubmission3 {

	public void doSubmission() throws InterruptedException, ExecutionException {
		ExecutorService exec = Executors.newFixedThreadPool(100);

		Future<?> result = exec.submit(new Callable<String>() {
			public String call() throws InterruptedException {
				System.out.println("Thread Started");
				Thread.sleep(5000);
				return "Super Duper";
			}

		});

		System.out.println("The End Result is..." + result.get());

		exec.shutdown();

		exec.awaitTermination(10, TimeUnit.SECONDS);

	}

	public void doSubmissionInvokeAny() throws InterruptedException, ExecutionException {
		ExecutorService exec = Executors.newFixedThreadPool(100);

		Set<Callable<String>> callables = new HashSet<>();

		callables.add(new Callable<String>() {
			public String call() throws InterruptedException {
				System.out.println("Thread1 Started");
				Thread.sleep(5000);
				return "Super Duper1";
			}
		});
		
		callables.add(new Callable<String>() {
			public String call() throws InterruptedException {
				System.out.println("Thread2 Started");
				Thread.sleep(2000);
				return "Super Duper2";
			}
		});
		
		callables.add(new Callable<String>() {
			public String call() throws InterruptedException {
				System.out.println("Thread2 Started");
				Thread.sleep(4000);
				return "Super Duper3";
			}
		});
		
		//String result = exec.invokeAny(callables);
		
		System.out.println(">>KickStarted<<");
		List<Future<String>> result = exec.invokeAll(callables);
		System.out.println(">>DONEDONEDONE<<");
		
		
		for(Future<String> str : result){
			System.out.println("=====================op... " + str.get());
		}
	

		exec.shutdown();

		exec.awaitTermination(10, TimeUnit.SECONDS);

	}
	
	public void doSubmissionScheduled() throws InterruptedException {
		
		ScheduledExecutorService sExec = Executors.newScheduledThreadPool(4);
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("My Thread1");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Completed");
			}
		};
		
		//ScheduledFuture<?> fut = sExec.schedule(task, 5, TimeUnit.SECONDS);
		ScheduledFuture<?> fut = sExec.scheduleWithFixedDelay(task, 2,4, TimeUnit.SECONDS);
			
		Thread.sleep(50000);

		sExec.shutdown();

		sExec.awaitTermination(100, TimeUnit.SECONDS);

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//new MyExecSubmission3().doSubmission();
		
		//new MyExecSubmission3().doSubmissionInvokeAny();
		
		new MyExecSubmission3().doSubmissionScheduled();
	}

}
