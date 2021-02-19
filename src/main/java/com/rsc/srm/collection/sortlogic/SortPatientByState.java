package com.rsc.srm.collection.sortlogic;

import java.util.Comparator;

import com.rsc.srm.model.Patient;

public class SortPatientByState implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		return o1.getState().compareTo(o2.getState());
	}



}
