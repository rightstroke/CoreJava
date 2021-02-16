package com.rsc.srm.fs.basic;

import java.math.BigInteger;

public class BigIntegerDemo {
	
	public BigInteger fac(int N) {
		BigInteger f = new BigInteger("1");
		
		for(int i=2;i<=N;i++) {
			f = f.multiply(BigInteger.valueOf(i));
			
		}
		
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bint = new BigIntegerDemo().fac(50);
		System.out.println(bint.isProbablePrime(8));
		
		System.out.println(bint.nextProbablePrime());
		
		System.out.println(bint.multiply(new BigInteger("4567")));
		
	}

}
