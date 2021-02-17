package com.rsc.srm.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.rsc.srm.fs.basic.Book;
import com.rsc.srm.fs.basic.Payment;


//Non Synchronnized
public class MyArrayList {

	public static void main(String[] args) {
		List myList = new ArrayList();
		
		List myList3 = Arrays.asList(new Payment(10, "DEG1232323", 5678),new Payment(11, "HJK1232323", 1234));
		
		myList.add(new Payment(1, "ABCD1232323", 9000));
		myList.add(new Payment(2, "ZBCD1232323", 4000));
		myList.add(new Payment(3, "XBCD1232323", 5000));
		myList.add(new Payment(4, "KBCD1232323", 6000));
		myList.add(new Payment(5, "ABCD1232323", 1000));
		myList.add(new Payment(5, "ABCD1232390", 20));
		myList.add(new Payment(6, "IBCD1232323", 500));
		myList.add(new Payment(1, "ABCD1232325", 9));
		myList.add(new Payment(5, "ABCD1232323", 1000));
		myList.add(new Payment(5, "ABCD1232390", 20));
		myList.add(new Payment(6, "IBCD1232323", 500));
		Payment p1 = new Payment(6, "IBCD1232323", 500);
		myList.add(p1);
		myList.add(p1);
		myList.add(new Book("Copper", "Copper Water"));
		
		myList.addAll(myList3);
		
		//Collections.sort(myList,new SortByAmountNew());    
		
//		Collections.sort(myList,new SortByTxnRefNumberNew()
//						.thenComparing(new SortByAmountNew())
//				);
		
		
		//System.out.println(myList.get(4));
		
		//myList.set(5, new Payment(1, "TUVD1232325", 999));
		
		//System.out.println(myList.contains(new Payment(1, "TUVD1232325", 999)));
		
		
		//System.out.println(myList.toString());
		
		//myList.forEach(System.out::println);
		
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
	}

}

class SortByAmountNew implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
		return obj1.getAmount().compareTo(obj2.getAmount());
	}
	
}


class SortByTxnRefNumberNew implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
		return obj1.getTxnRefNumber().compareTo(obj2.getTxnRefNumber());
	}
	
}
