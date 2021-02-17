package com.rsc.srm.model;

import java.util.Calendar;

public class PatientData extends BaseModel {
	
	
	public PatientData(Calendar dOfTest, String observation) {
		super();
		this.dOfTest = dOfTest;
		this.observation = observation;
	}

	@Override
	public String toString() {
		return "PatientData [dOfTest=" + dOfTest + ", observation=" + observation + "]";
	}

	private Calendar dOfTest;
	
	private String observation;

	public Calendar getdOfTest() {
		return dOfTest;
	}

	public void setdOfTest(Calendar dOfTest) {
		this.dOfTest = dOfTest;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	
}
