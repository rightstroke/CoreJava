package com.rsc.srm.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.rsc.srm.fs.basic.Payment;

public class MyTreeMap {

	public static void main(String[] args) {
		Map tMap = new TreeMap(new SortByAmount2().thenComparing(new SortByTxnRefNumber2()));

		Payment p1 = new Payment(1, "ABCD1232323", 9000);
		Payment p2 = new Payment(2, "ZBCD1232323", 4000);
		Payment p3 = new Payment(3, "XBCD1232323", 5000);
		Payment p4 = new Payment(4, "KBCD1232323", 6000);
		Payment p5 = new Payment(5, "ABCD1232323", 1000);
		Payment p6 = new Payment(6, "IBCD1232323", 500);
		Payment p7 = new Payment(1, "ABCD1232325", 9);
		
		tMap.put(p1, p1.getTxnRefNumber());
		tMap.put(p2, p2.getTxnRefNumber());
		tMap.put(p3, p3.getTxnRefNumber());
		tMap.put(p4, p4.getTxnRefNumber());
		tMap.put(p5, p5.getTxnRefNumber());
		tMap.put(p6, p6.getTxnRefNumber());
		tMap.put(p7, p7.getTxnRefNumber());

		System.out.println(tMap);

	}

}

class SortByAmount2 implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
		return obj1.getAmount().compareTo(obj2.getAmount());
	}

}

class SortByTxnRefNumber2 implements Comparator<Payment> {

	@Override
	public int compare(Payment obj1, Payment obj2) {
		return obj1.getTxnRefNumber().compareTo(obj2.getTxnRefNumber());
	}

}
