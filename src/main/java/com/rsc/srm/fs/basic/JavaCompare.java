package com.rsc.srm.fs.basic;

public class JavaCompare {

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "A";
		
		System.out.println(s1.hashCode());
		System.out.println("A".hashCode());
		
		int a = 10;
		
		if (a==10) {
			System.out.println(" i am here ");
		}
		
		System.out.println(s1==s2);
		
		String s3 = new String("A");

		System.out.println(s1==s3);
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.compareTo(s3));
	}

}
