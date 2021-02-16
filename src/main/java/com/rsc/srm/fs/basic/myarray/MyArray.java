package com.rsc.srm.fs.basic.myarray;

import java.util.List;
import java.util.Vector;

public class MyArray {
	
	
	
	/**
	 * More than one thread is tryin access this method
	 * THread A and Thread B
	 */
	public void oneAtATime() {
		List lst = new Vector<>();
		lst.add("rsc");
		
		int a = 100;
	}
	

	public static void main(String[] args) {
		String[] mynames = new String[3];
		
		mynames[0] = "Basha";
		mynames[1] = "Linga";
		mynames[2] = "Muthu";
		
		System.out.println(mynames.length);
		
		String[] mynames2 = mynames;
		String[] myclonedNames = mynames.clone();
		mynames2[2] = "Annamalai";
		
		
		if (mynames == myclonedNames) {
			System.out.println("same refernces");
		} else 
			System.out.println("NNOOTTT same refernces");
		
		for(int i=0;i<mynames.length;i++) {
			//System.out.println("==" + mynames[i]);
		}
		
		for(String myName : mynames) {
			System.out.println(myName);
		}
	}

}
