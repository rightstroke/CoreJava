package com.rsc.srm.fs.basic;

public class StringDemo {

	public static void main(String[] args) {
		String a = "RSC-Consulting- Pvt  Limited";
		
		//686063476
		//339949216
		
		System.out.println(a.hashCode());
		
		char[] chararray = new char[2];
		chararray[0] = 32;
		chararray[1]='A';
		
		System.out.println(chararray.toString());
		for(char chr:chararray) {
			System.out.println(chr);
		}
		
		char[] aArray = a.toCharArray();
		
		String[] names = new String[] {"rsc","consulting"};
		
		
//		a = a + "-Consulting";
//	
//		a= a + " - Pvt Limited";
//		
//		//System.out.println(a);
//		
//		StringBuilder sb = new StringBuilder("RSC");
//		sb.append("-Consulting");
//		sb.append("-Pvt Limited");
//
//		System.out.println(sb.toString());
//		
		//String Builder //Non Sychronized
		
		//String Buffer // Synchronized

	}

}
