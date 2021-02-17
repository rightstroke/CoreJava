package com.rsc.srm.collection.generics;

import java.util.ArrayList;
import java.util.List;

import com.rsc.srm.fs.basic.oop.association.Account;
import com.rsc.srm.fs.basic.oop.association.DematAccount;
import com.rsc.srm.fs.basic.oop.association.SavingsAccount;

public class BoundInteritance {

	public static void main(String[] args ) {
		MyBound<DematAccount> mB = new MyBound<>(new DematAccount());
		System.out.println(mB.getObj());
		
//		List<T extends Account> lst = new ArrayList<>();
//		lst.add(new DematAccount());
//		lst.add(new SavingsAccount());
	}

}

class MyBound<T extends Account> {
	public T obj;
	
	MyBound(T obj){
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
}
