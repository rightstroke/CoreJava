package com.rsc.srm.fs.basic.oop.interfce;

public class InterfaceClient {

	public static void main(String[] args) {
		//Anti Pattern
		//GPAYPaymentManagerImpl gpay = new GPAYPaymentManagerImpl();
		//PayTMPaymentManagerImpl2 payTm = new PayTMPaymentManagerImpl2();
	
		PaymentManager gpay = new GPAYPaymentManagerImpl();;
		PaymentManager payTm = new PayTMPaymentManagerImpl2(); 
	
	}
	

}
