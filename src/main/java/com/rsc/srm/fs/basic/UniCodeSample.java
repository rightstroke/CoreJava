package com.rsc.srm.fs.basic;

import java.nio.charset.StandardCharsets;

public class UniCodeSample {
	  

	
	static {
		System.out.println("in sb 1");
	}
	
	static {
		System.out.println("in sb 2");
	}
	
	static {
		System.out.println("in sb 3");
	}
	
//	{
//		System.out.println(" i dont what will happen here");
//	}
	

	public static void main(String[] args) {
		System.out.println("In MAIN METHOD");
		// TODO Auto-generated method stub
		String name = "RSC Consulting";
		
		System.out.println(name);
		
		String german = "Leseübungen";
		
		System.out.println(german);
		
		
		
		byte[] germanchars = german.getBytes();
		
		String usaschii = new String(germanchars,StandardCharsets.US_ASCII);
		System.out.println(usaschii);
		
		String usaschii8 = new String(germanchars,StandardCharsets.UTF_8);
		System.out.println(usaschii8);
	}

}
