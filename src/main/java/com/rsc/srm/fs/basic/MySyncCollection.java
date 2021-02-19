package com.rsc.srm.fs.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class MySyncCollection {

	public void updateNames(String value) {
		List<String> lstNames = Collections.synchronizedList(new ArrayList<>());
		
		if (value.contains("RSC")) {
			lstNames.add(value);
		} else lstNames.remove(9);
	}
	
	public void safeMap() {
		ConcurrentHashMap<String, Book> conMap = new ConcurrentHashMap<>();
	}
	
	public static void main(String[] args) {
		
		
	}

}
