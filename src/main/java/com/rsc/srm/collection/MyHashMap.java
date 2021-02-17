package com.rsc.srm.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.rsc.srm.fs.basic.Book;

public class MyHashMap {
	
	public void doHashMap() {
		Map mp = new HashMap();
		
		mp.put("1001", "Kala");
		mp.put("2001","Kabali");
		mp.put("1001", "Kalaiyan");
		
		Book b1 = new Book("name1","author3");
		Book b2 = new Book("name2","author4");
		Book b3 = new Book("name3","author7");
		Book b4 = new Book("name4","author9");
		
		
		
		mp.put(b1.getName(),b1);
		mp.put(b2.getName(),b2);
		mp.put(b3.getName(),b3);
		mp.put(b4, b4);
		
		Book b5 = new Book("name4","author9");
		
		System.out.println(b4.hashCode() +  "," + b5.hashCode());
		
		if (mp.containsKey(b5)) {
			System.out.println("Gotchaa...");
		}
		
		if (mp.containsValue(b5)) {
			System.out.println("Gotchaa again...");
		}
		
		//System.out.println(mp);
		
		Set set = mp.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
	}

	public static void main(String[] args) {
		new MyHashMap().doHashMap();

	}

}
