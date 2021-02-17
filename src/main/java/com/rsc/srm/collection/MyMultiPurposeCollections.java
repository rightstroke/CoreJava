package com.rsc.srm.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.rsc.srm.model.Patient;
import com.rsc.srm.model.PatientData;

public class MyMultiPurposeCollections {
	
	
	public void doRepresentMyCLinicalData() {
		Map hmMap = new HashMap();
		
		hmMap.put(getPatient("1","IND","CHN"),getPatientClinicalData());
		
		System.out.println(hmMap);
	}
	
	private Patient getPatient(String id, String country,String city) {
		Patient p1 = new Patient(id,country,city);
		
		return p1;
	}
	
	private List getPatientClinicalData() {
		PatientData pData1 = new PatientData(Calendar.getInstance(), "Body Pain1");
		PatientData pData2 = new PatientData(Calendar.getInstance(), "Body Pain2");
		PatientData pData3 = new PatientData(Calendar.getInstance(), "Body Pain3");
		
		PatientData pData4 = new PatientData(Calendar.getInstance(), "Body Pain5");
		PatientData pData5 = new PatientData(Calendar.getInstance(), "Body Pain4");
		
		LinkedList lst =  new LinkedList();
		
		List subLst =  new ArrayList();
		subLst.add(pData5);
		subLst.add(pData4);
		
		
		lst.add(pData1);
		lst.add(pData2);
		lst.add(pData3);
		lst.add(subLst);
		
		return lst;
	}
	

	public static void main(String[] args) {
		
		new MyMultiPurposeCollections().doRepresentMyCLinicalData();
	}

}
