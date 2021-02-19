package com.rsc.src.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyExecutor01 {

	public void doProcessMyData() throws InterruptedException {
		// ExecutorService exec = Executors.newSingleThreadExecutor();
		ExecutorService exec = Executors.newFixedThreadPool(10);
		// Job1
		exec.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread #1 - Started...");
				for (int i = 0; i < 10; i++) {
					System.out.println("=========In Action");
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread #1 - Completed....");
			}
		});

		// Job2
		exec.execute(new Runnable() {

			@Override
			public void run() {
				int ii = 5;
				System.out.println("Thread #2 - Started...");
				for (int i = 0; i < 5; i++) {
					System.out.println("=========In Action" + ++ii);
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread #2 - Completed....");
			}
		});

		// Job3
		exec.execute(new Runnable() {

			@Override
			public void run() {
				int ii = 100;
				System.out.println("Thread #3 - Started...");
				for (int i = 0; i < 5; i++) {
					System.out.println("=========In Action" + ++ii);
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread #3 - Completed....");
			}
		});

		exec.shutdown();

		exec.awaitTermination(10, TimeUnit.SECONDS);

	}

	public static void main(String[] args) throws InterruptedException {
		new MyExecutor01().doProcessMyData();
	}

}
