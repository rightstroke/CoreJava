package com.rsc.srm.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSort {
	public static void main(String[] args) {
		Map mp = new HashMap();
		
		mp.put(new Integer("1001"), "Kala");
		mp.put(new Integer("2001"),"Kabali");
		mp.put(new Integer("999"), "Kalaiyan");
		mp.put(new Integer("9991"), "Annamalai");
		mp.put(new Integer("9992"), "Zimba");
		
		Map sortedTMap = new TreeMap(mp);
		
		System.out.println(sortedTMap);
		
		List sortedUserKey = new ArrayList(mp.keySet());
		
		Collections.sort(sortedUserKey);
		
		System.out.println(sortedUserKey);
		
		List sortedUserValue = new ArrayList(mp.values());
		
		Collections.sort(sortedUserValue,Collections.reverseOrder());
		
		System.out.println(sortedUserValue);
	}
}
