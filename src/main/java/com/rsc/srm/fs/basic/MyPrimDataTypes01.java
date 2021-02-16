package com.rsc.srm.fs.basic;

public class MyPrimDataTypes01 {

	public void doByteOperation() {
		byte bte = 126;

		System.out.println(bte);

		bte++; // bte = bte+1

		System.out.println(bte);

		bte++; // bte = bte+1

		System.out.println(bte);
	}

	public void doCharOperation() {

		char chr = 65;

		char chr2 = 'A';

		System.out.println(chr + "," + chr2);

		System.out.println(Character.isDigit('8'));

	}

	public void doIntOperation() {

		int salary = 10000;
		
		System.out.println(salary);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		double val = 23d;
		
		System.out.println(val/13d);
		
		System.out.println("Int Divide = " + 5/3);
		

	}

	public static void main(String[] args) {
		System.out.println("Start....");

		// new MyShort01().doByteOperation();

		MyPrimDataTypes01 myshort = new MyPrimDataTypes01();
		myshort.doByteOperation();
		System.out.println("==");
		myshort.doCharOperation();
		System.out.println("==");
		myshort.doIntOperation();

	}

}
