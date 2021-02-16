package com.rsc.srm.fs.basic.oop.interfce;

public class GPAYPaymentManagerImpl extends BasePayment implements PaymentManager,LoggerManager {

	public String doFundsTransfer(String acc1, String acc2) {
		if (checkAccuntBalance("123232", 43343)) {
			
		}
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
