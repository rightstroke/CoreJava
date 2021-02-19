package com.rsc.srm.mythreads;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MyThreadLocal implements Runnable {
	
	String name = "RSC";
	
	private ThreadLocal<String> inputdata = new ThreadLocal<String>();

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(3);
			String a = new Date().toString();
			name += a;
			inputdata.set("The value is ..." + a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		System.out.println(name);
		System.out.println(Thread.currentThread().getId() + ",=" +   inputdata.get());

	}
	
	public static void main(String[] args) throws InterruptedException {
		MyThreadLocal mythrLocal = new MyThreadLocal();
		
		Thread thrd1 = new Thread(mythrLocal);
		Thread thrd2 = new Thread(mythrLocal);
		
		thrd1.start();
		
		thrd1.join();
		
		thrd2.start();
	}
	

}
