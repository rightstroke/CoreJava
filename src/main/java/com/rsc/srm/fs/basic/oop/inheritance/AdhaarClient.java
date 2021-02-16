package com.rsc.srm.fs.basic.oop.inheritance;

public class AdhaarClient {

	public static void main(String[] args) {
		AdhaarImpl adhImpl = new AdhaarImpl("TN", "bio");
		
		adhImpl.intitateAdaarrCreationProcess();
		
		adhImpl.getStatus();
	}

}
