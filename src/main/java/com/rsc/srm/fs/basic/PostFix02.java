package com.rsc.srm.fs.basic;

public class PostFix02 {
	public static void main(String[] args) {
		int counter = 0;

		int inter = ++counter; //1

		System.out.println(inter); //1

		inter = counter++; //2

		System.out.println(inter); //1
		
		System.out.println(counter); //1

	}
}
