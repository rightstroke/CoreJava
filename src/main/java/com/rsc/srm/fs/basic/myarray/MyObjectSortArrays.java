package com.rsc.srm.fs.basic.myarray;

import java.util.Arrays;
import java.util.Comparator;

public class MyObjectSortArrays {

	public static void main(String[] args) {
		Account[] acts = new Account[3];
		
		Account act1 = new Account(100, "123232323");
		Account act2 = new Account(23, "4343fdfd");
		//Account act3 = new Account(3, '456789');
		
		
		acts[0] = act1;
		acts[1] = act2;
		acts[2] = new Account(9, "abcd");
		
		Arrays.sort(acts,new SortbyId());
		
		int[] salaries = new int[] {12,34,54,99,3,1,999};
		
		Arrays.sort(salaries);
		
		//System.out.println(Arrays.asList(salaries));
		
		for(int sal : salaries) {
			System.out.println(sal);
		}
		
		for(Account act :acts) {
			//System.out.println(act.getId() + "," + act.getName());
		}
		
		
		//acts = new Account[3];
	}

}

class SortbyId implements Comparator<Account> {

	public int compare(Account first, Account second) {
		// TODO Auto-generated method stub
		//return second.getId() - first.getId();
		return second.getName().compareTo(first.getName());
	}
	
}
