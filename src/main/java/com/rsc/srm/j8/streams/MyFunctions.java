package com.rsc.srm.j8.streams;

import java.util.function.Function;

public class MyFunctions {
	
	public void doProcess1() {
		Function<Integer,String> myFunc = (a)->{
			return a.toString().concat("RS");
		};
		
		System.out.println(myFunc.apply(56));
	}
	
	public void doProcess2() {
		//Function<Long,Long> add300 = new MyFnAddes300();
		
		
		Function<Long,Long> add300 = (x)->x+300;
		
		System.out.println(add300.apply(100l));
	}
	
	public void doProcess3() {
		Function<Integer, Integer> multiply = (x)-> x*5;
		Function<Integer, Integer> add = (y)-> y+5;
		
		Function<Integer, Integer> addAndThenMutiply = multiply.compose(add);
		
		System.out.println(addAndThenMutiply.apply(10));
		
		Function<Integer, Integer> multipleThenAdd = multiply.andThen(add);
		
		System.out.println(multipleThenAdd.apply(10));
	}

	public static void main(String[] args) {
		new MyFunctions().doProcess3();
	}

}

class MyFnAddes300 implements Function<Long, Long> {

	@Override
	public Long apply(Long t) {
		// TODO Auto-generated method stub
		return t + 300;
	}
	
}


