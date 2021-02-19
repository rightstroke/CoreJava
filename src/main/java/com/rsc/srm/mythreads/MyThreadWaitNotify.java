package com.rsc.srm.mythreads;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MyThreadWaitNotify {

	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce("Thread....1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce("Thread....2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t3.join();
		t2.join();
	}

	/**
	 * Producer and Consumer
	 * 
	 * @author train
	 *
	 */
	public static class PC {

		public void produce(String val) throws InterruptedException {
			synchronized (this) {
				System.out.println(val + ", The Producer Thread is waiting");

				wait();

				System.out.println("Thread got resumed...for" + val);
			}
		}

		public void consume() throws InterruptedException {
			TimeUnit.SECONDS.sleep(2);

			Scanner keyEnter = new Scanner(System.in);

			synchronized (this) {
				System.out.println("Please Press Enter Key to resume the wait operation");

				keyEnter.nextLine();

				System.out.println("Enter Key has been pressed");

				notifyAll();
				//notify();

				TimeUnit.SECONDS.sleep(3);

			}
		}

	}
}
