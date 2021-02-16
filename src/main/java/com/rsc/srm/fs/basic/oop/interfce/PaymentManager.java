package com.rsc.srm.fs.basic.oop.interfce;


//Contract
public interface PaymentManager  {
	public String doFundsTransfer(String acc1,String acc2);
	
	public String retryFundsTransfer(String txnRefNo);
}
