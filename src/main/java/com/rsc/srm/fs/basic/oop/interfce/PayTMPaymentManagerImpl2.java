package com.rsc.srm.fs.basic.oop.interfce;

public class PayTMPaymentManagerImpl2 extends BasePayment implements PaymentManager,LoggerManager {

	public String doFundsTransfer(String acc1, String acc2) {
		return "Funds Transfer Done";
	}

	public String retryFundsTransfer(String txnRefNo) {
		
		return "Still its a failure";
	}

	public void debug(String val) {
		// TODO Auto-generated method stub
		
	}

	public void info(String val) {
		// TODO Auto-generated method stub
		
	}

}
