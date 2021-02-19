package com.rsc.srm.collection.sortlogic;

import java.util.Comparator;

import com.rsc.srm.model.Patient;

public class SortPatientByCountry implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		return o1.getCountry().compareTo(o2.getCountry());
	}



}
