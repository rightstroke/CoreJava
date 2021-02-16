package com.rsc.srm.fs.basic.oop.inheritance;

public class AdhaarImpl {
	public String demoGraphiccs;

	public String bioMetrics;
	
	private Boolean status=false;
	
	public Boolean getStatus() {
		return status;
	}

	public AdhaarImpl(String demoGraphiccs, String bioMetrics) {
		super();
		this.demoGraphiccs = demoGraphiccs;
		this.bioMetrics = bioMetrics;
	}

	public String intitateAdaarrCreationProcess() {

		if (checkForDuplicates()) {
			this.status = true;
			generateAdhaar();
		}else {
			this.status = false;
		}

		return "1234-323232-323232-2323";

	}

	private String generateAdhaar() {

		/// loginc
		
		return "!212232323232323232";
	}

	private Boolean checkForDuplicates() {
		return true;
	}
}
