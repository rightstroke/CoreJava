package com.rsc.srm.collection.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundGenerics {

	public static void main(String[] args) {

		List<Integer> listInt = Arrays.asList(5,6,7,8,9);
		
		System.out.println(sum(listInt));
		
		List<Double> lstDouble = Arrays.asList(4.5,6.7,7.8,5.2);
		System.out.println(sum(lstDouble));
		System.out.println("===============");
		
		List<Number> listNum = Arrays.asList(1,6,7,8,5);
		printData(listNum);
		
		printData(listInt);
		
		//printData(lstDouble);
	
	}
	
	/**
	 * Upper Bound
	 * @param numList
	 * @return
	 */
	private static double sum(List<? extends Number> numList) {
		double sum = 0.0;
		
		for(Number d : numList) {
			sum  += d.doubleValue();
		}
		
		return sum;
	}
	
	/**
	 * Lower Bound
	 * @param numList
	 */
	private static void printData(List<? super Integer> numList) {
		System.out.println(numList);
	}

}
