package com.rsc.srm.fs.basic;

public class TypeConv03 {

	public static void main(String[] args) {
		short age = 45;
		
		int newage = age;
		
		System.out.println(newage);
		
		short oldage = (short) newage;
		
		System.out.println(oldage);
		
		short a = 80;
		
		short b = 20;
		
		int c = a/b;
		
		System.out.println(c);

	}

}
