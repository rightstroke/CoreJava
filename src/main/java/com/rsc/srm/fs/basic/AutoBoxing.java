package com.rsc.srm.fs.basic;

public class AutoBoxing {

	public static void myMethod(Integer num,boolean bb) {
		System.out.println(num);
		
		int x = num;
		
		System.out.println(x);
		
		boolean b = Boolean.TRUE;
	}

	public static void main(String[] args) {
		int a = 10;
		myMethod(a,Boolean.FALSE);
	}

}
