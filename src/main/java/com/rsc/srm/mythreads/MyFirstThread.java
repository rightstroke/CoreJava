package com.rsc.srm.mythreads;

public class MyFirstThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread Name...Start" + Thread.currentThread().getName());
		
		for(int i=0;i<10;i++) {
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
		MyFirstThread thread1 = new MyFirstThread();
		MyFirstThread thread2 = new MyFirstThread();
		MyFirstThread thread3 = new MyFirstThread();
		MyFirstThread thread4 = new MyFirstThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
			thread4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		raiseCompletingFlag();
	}
	
	static void raiseCompletingFlag() {
		System.out.println("COMPLETED ######################");
	}

}
