package com.rsc.srm.fs.basic.oop.interfce;

public interface NewPaymentManager extends LoggerManager {
	public String doFundsTransfer(String acc1, String acc2);

	public String retryFundsTransfer(String txnRefNo);
	
	default void checkCompliaces() {
		System.out.println("CHeck Complance is being called");
	}
}
