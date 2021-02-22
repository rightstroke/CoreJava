package com.rsc.srm.j8.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyPedicate {
	
	public void doOption1() {
		Predicate<Integer> numGreaterThan5 = (x)->x>5;
		/**
		 * public boolean (Integer x) {
		 * 		return x>5;
		 * }
		 */
		
		
		
		Predicate<Integer> numGreaterThan100 = (y)->y>100;
		
		//Predicate<Integer> myNewPred = numGreaterThan5.and(numGreaterThan100);
		Predicate<Integer> myNewPred = numGreaterThan5.or(numGreaterThan100);
		
		List<Integer> lstAges = Arrays.asList(102,55,6,4,3,2,1,110,99);
		
		List<Integer> lstFilteredAges = lstAges.stream()
										.filter(myNewPred.negate())
//										.filter(numGreaterThan100)
										.collect(Collectors.toList());
		
		System.out.println(lstFilteredAges);
		
		
		//System.out.println(myNewPred.test(101));
		
	}
	
	public void doOption2() {
		BiPredicate<Integer, String> mypred = (x,y)->{
			if (y.length()==x) {
				return true;
			} else return false;
		};	
		
		System.out.println(mypred.test(5,"CCO"));
	}



	public static void main(String[] args) {
		new MyPedicate().doOption2();

	}

}
