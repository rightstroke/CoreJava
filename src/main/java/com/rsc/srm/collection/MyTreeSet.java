package com.rsc.srm.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.rsc.srm.fs.basic.Book;

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
	
	

	public static void main(String[] args) {
		//new MyTreeSet().doTreeSet();
		new MyTreeSet().doTreeSetByBook();
	}

}
