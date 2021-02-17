package com.rsc.srm.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		System.out.println(ll);
		
		ll.add("Name1");
		ll.add("Name2");
		ll.add("Name3");
		
		System.out.println("1==>" + ll);
		
		ll.addFirst("Name0");
		ll.addLast("Name.N");
		
		ll.addFirst("Name00");
		ll.addLast("Name.NN");
		
		System.out.println("2==>" + ll);
		
		System.out.println("Read The first Item..." + ll.peek());
		System.out.println("Remove The first Item..." + ll.poll());
		
		System.out.println("3==>" + ll);
		
		ll.remove("Name2");
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("4==>" + ll);
		
		ll.add(1, "Name-New");
		System.out.println("5==>" + ll);
		
		Iterator ltr = ll.descendingIterator();
		
		while (ltr.hasNext()) {
			System.out.println("$$$$=" + ltr.next());
		}
	}

}
