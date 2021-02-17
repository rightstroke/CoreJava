package com.rsc.srm.collection.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rsc.srm.fs.basic.Book;
import com.rsc.srm.fs.basic.Payment;

public class MyOwnGenerics {

	public static void main(String[] args) {
		// Map<String,Book> hm = new HashMap<String,Book>();
		MyList<Book> myBook = new MyList<>(new Book("a", "b"));
		myBook.add();
		myBook.add();
		myBook.add();

		myBook.getListData();

		// MyList<Payment> myPayment = new MyList<>(new Payment(1, "ABCD1232323",
		// 9000));
		// myPayment.add();
		
		YourMap<String,Integer> myMap = new YourMap<>("RSC",1234);
		YourMap<String,Integer> myMap2 = new YourMap<>("RSC",new Integer(456));
	}

}

//T is Type Erasure
class MyList<T> {
	T obj;
	List lst = new ArrayList();

	MyList(T obj) {
		this.obj = obj;
		if (obj instanceof Book) {
			System.out.println("Book");
		} else if (obj instanceof Payment) {
			System.out.println("Payment");
		} else
			System.out.println("Others");
	}

	public void getListData() {
		System.out.println(lst);
	}

	public void add() {
		lst.add(this.obj);
	}
}

class YourMap<T, U> {
	T objt;
	U obju;

	YourMap(T objt, U obju) {
		this.objt = objt;
		this.obju = obju;
	}
	
	public void doSomething() {
		System.out.println(this.objt + "," + this.obju);
	}
}
