package com.rsc.srm.fs.basic;

public class DoubleProblem {

	public static void main(String[] args) {
		double total = 0.3;
		
		for(int i=0;i<100;i++) {
			total += 0.3;
		} //30
		
		//123.45  Precision 5, scale 2
		
		System.out.println(total);
	}

}
