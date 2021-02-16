package com.rsc.srm.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
    
public class MyHashSet {
	
	public void doPerformHashSet() {
		Set myHS = new HashSet();
		myHS.add("RSC");
		myHS.add("Consulting");
		
		myHS.add("RSC");
		myHS.add("RSc");
		
		myHS.add(null);
		
		Iterator itr= myHS.iterator();
		while (itr.hasNext()) {
			System.out.println("==>" + itr.next());
		}
		
		System.out.println(myHS.contains("RSc"));
		myHS.remove("RSc");
		System.out.println(myHS.contains("RSc"));
		
		System.out.println("===Done");
	}

	public static void main(String[] args) {
		new MyHashSet().doPerformHashSet();

	}

}
