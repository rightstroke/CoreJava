package com.rsc.srm.fs.basic.myarray;

public class MyObjectArray {

	public static void main(String[] args) {
		Account[] acts = new Account[3];
		
		Account act1 = new Account(1, "123232323");
		Account act2 = new Account(2, "4343fdfd");
		//Account act3 = new Account(3, '456789');
		
		
		acts[0] = act1;
		acts[1] = act2;
		acts[2] = new Account(3, "abcd");
		
		for(Account act :acts) {
			System.out.println(act.getId() + "," + act.getName());
		}
		
		
		//acts = new Account[3];
	}

}
