package com.rsc.srm.fs.basic.oop.inheritance;

public class MyPaymentProcessor {
	public Boolean processPayment(String CreditCard,short cvv) {
		return true;
	}
	
	public Boolean processPayment(String DebitCard,short cvv,String bankCode) {
		return true;
	}
	
	public String processPayment(String upiId,String appName) {
		return "123";
	}
}
