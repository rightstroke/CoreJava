package com.rsc.srm.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.rsc.srm.fs.basic.Book;
import com.rsc.srm.fs.basic.Payment;

public class MyTreeSet {
	
	public void doTreeSet() {
		
		Set myHS = new TreeSet();
		myHS.add("Zambia");
		myHS.add("RSC");
		myHS.add("Consulting");
		myHS.add("Australia");
		
		myHS.add("RSC");
		myHS.add("RSc");
		
		Iterator itr= myHS.iterator();
		while (itr.hasNext()) {
			System.out.println("==>" + itr.next().toString());
		}
	}
	
	
	public void doTreeSetByBook() {
		Set myBSet = new TreeSet();
		myBSet.add(new Book("Zero Autobiography", "zero"));
		myBSet.add(new Book("Muthu Autobiography", "muthu"));
		myBSet.add(new Book("Rajini Autobiography", "sivaji"));
		myBSet.add(new Book("Annamalai Autobiography", "anna"));
		
		Iterator itr= myBSet.iterator();
		while (itr.hasNext()) {
			System.out.println("==>" + itr.next().toString());
		}
	}
	
	public void doPaymentSorting()  {
		//Set myPaySet = new TreeSet(new SortByAmount());
		
		//Set myPaySet = new TreeSet(new SortByTxnRefNumber());
		
		Set myPaySet = new TreeSet(new SortByTxnRefNumber().thenComparing(new SortByAmount()));
		myPaySet.add(new Payment(1, "ABCD1232323", 9000));
		myPaySet.add(new Payment(2, "ZBCD1232323", 4000));
		myPaySet.add(new Payment(3, "XBCD1232323", 5000));
		myPaySet.add(new Payment(4, "KBCD1232323", 6000));
		myPaySet.add(new Payment(5, "ABCD1232323", 1000));
		myPaySet.add(new Payment(6, "IBCD1232323", 500));
		myPaySet.add(new Payment(1, "ABCD1232325", 9));
		
		Iterator itr= myPaySet.iterator();
		while (itr.hasNext()) {
			System.out.println("Pay==>" + itr.next().toString());
		}
		
	}
	
	

	public static void main(String[] args) {
		//new MyTreeSet().doTreeSet();
		//new MyTreeSet().doTreeSetByBook();
		new MyTreeSet().doPaymentSorting();
	}

}

class SortByAmount implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
		return obj1.getAmount().compareTo(obj2.getAmount());
	}
	
}


class SortByTxnRefNumber implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
		return obj1.getTxnRefNumber().compareTo(obj2.getTxnRefNumber());
	}
	
}

class SortByTxnRefNumberThenAmount implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
	
		if (obj1.getTxnRefNumber().compareTo(obj2.getTxnRefNumber()) > 0) {
			return obj1.getTxnRefNumber().compareTo(obj2.getTxnRefNumber());
		} else {
			return obj2.getTxnRefNumber().compareTo(obj1.getTxnRefNumber());
		}
		
	}
	
}
