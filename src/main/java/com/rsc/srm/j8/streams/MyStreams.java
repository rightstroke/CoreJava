package com.rsc.srm.j8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.rsc.srm.fs.basic.Payment;

public class MyStreams {

	public void doProcess1() {
		List<Integer> intAges = Arrays.asList(3,4,5,6,7,8);
		
		for(int i=0;i<intAges.size();i++) {
			intAges.set(i, intAges.get(i)+2);
		}
		
		for(int i=0;i<intAges.size();i++) {
			intAges.set(i, intAges.get(i)*2);
		}
		
		System.out.println(intAges);
		
	}
	
	/**
	 * x -> x+2
	 * public Integer method(x) {
	 * 	return x+2
	 * }
	 */
	
	
	public void doProcess2() {
		List<Integer> intAges = Arrays.asList(3,4,5,6,7,8); //6 elements in prd, 10 Million.
		
		//Map i/p of Function
		
		List<Integer> intDoubleAges = intAges.stream().map(x-> x+2).map(y->y*3).collect(Collectors.toList());
									
		System.out.println(intDoubleAges);
	}
	
	public void doProcess3() {
		List<String> myNames = Arrays.asList("Baba", "Mark Antory", "Basha","Annamaalai","Kalaiyaan");
		
		//Filter, i/p is a Predicaste
		
		List<String> myFilteredList = myNames.stream().filter(s-> s.length()>4).filter(s-> s.contains("aa")).collect(Collectors.toList());
		
		List<String> mySortedList = myNames.stream().filter(s-> s.length()>4).sorted().collect(Collectors.toList());
									
		System.out.println(mySortedList);
	}
	
	public void doProcess4() {
		
		Payment p1 = new Payment(1, "ABCD12345", 500);
		Payment p2 = new Payment(4, "ABCD1234", 5);
		Payment p3 = new Payment(5, "ABCD1245", 17);
		Payment p4 = new Payment(1, "ABCD1345", 39);
		Payment p5 = new Payment(3, "ABC12345", 157);
		
		
		
		
		List<Payment> myPayments = new ArrayList<>();
		myPayments.add(p1);
		myPayments.add(p2);
		myPayments.add(p3);
		myPayments.add(p4);
		myPayments.add(p5);
		
		Comparator<Payment> myCom = new Comparator<Payment>() {

			@Override
			public int compare(Payment o1, Payment o2) {
				// TODO Auto-generated method stub
				return o1.getTxnRefNumber().compareTo(o2.getTxnRefNumber());
			}
			
		};
		
		
		//myPayments.stream().sorted(myCom).forEach(y -> System.out.println(y));
		
		myPayments.stream().sorted(myCom).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
	
		//new MyStreams().doProcess1();
		
		//new MyStreams().doProcess2();
		
		//new MyStreams().doProcess3();
		
		new MyStreams().doProcess4();
	}

}
