package com.rsc.srm.collection.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rsc.srm.fs.basic.Book;

public class MyNoGenerics {
	
	public void noGenerics() {
		List lst = new ArrayList();
		lst.add(new Integer("45"));
		
		lst.add(new String("145"));
		
		System.out.println(lst);
		
		Integer result = (Integer) lst.get(0);
		System.out.println(result);
		
		Integer result1 = (Integer) lst.get(1);
		System.out.println(result1);
	}
	
	public void withGenerics() {
		List<Integer> lst = new ArrayList<Integer>();
		List<String> lstString = new ArrayList<String>();
		lst.add(new Integer("45"));
		lst.add(999);
		
		Integer res = lst.get(0)*345;
		
		//lst.add("456");
		
		System.out.println(lst);
		
		Integer result = (Integer) lst.get(0);
		System.out.println(result);
		
		Integer result1 = (Integer) lst.get(1);
		System.out.println(result1);
		
		lstString.add("Test123");
		//lstString.add(Boolean.TRUE);
		//lstString.add(123);
		
	}
	
	public void withGenericsHM() {
		Map<String,Book> hm = new HashMap<String,Book>();
		hm.put("key1", new Book("author1","name1"));
		hm.put("key2", new Book("author2","name2"));
		hm.put(new Integer("567").toString(), new Book("author3","name3"));
		
		System.out.println(hm);
	}
	
	

	public static void main(String[] args) {
		new MyNoGenerics().withGenerics();
	}

}
