package com.rsc.srm.mythreads;

import java.util.concurrent.atomic.AtomicInteger;

public class MyBestThread implements Runnable {
	
	private String data;
	
	
	
	
	MyBestThread(String data){
		this.data = data;
	}

	@Override
	public void run() {
		
		System.out.println("Thread Name...Start" + Thread.currentThread().getName());

		for (int i = 0; i <10; i++) {
			System.out.println("Thread runnung..." + i + "," + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Threasd stoped");

	}

	public static void main(String[] args) {
		MyBestThread myThread = new MyBestThread("Data");
		
		Thread thrd = new Thread(myThread);
		thrd.setName("File1 Thread");
		thrd.setPriority(Thread.MAX_PRIORITY);
		//thrd.setDaemon(true);
		thrd.start();
		
		Thread thrd1 = new Thread(myThread);
		thrd1.setPriority(Thread.MIN_PRIORITY);
		thrd1.setName("File2 Thread");
		//thrd1.setDaemon(true);
		thrd1.start();
		
		Thread thrd2 = new Thread(myThread);
		thrd2.setName("File3 Thread");
		//thrd2.setDaemon(true);
		thrd2.start();
		
		Thread thrd3 = new Thread(myThread);
		thrd3.setName("File4 Thread");
		//thrd3.setDaemon(true);
		thrd3.start();
		
		System.out.println("=================================DONE");
		

	}

}
