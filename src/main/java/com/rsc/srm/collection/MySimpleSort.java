package com.rsc.srm.collection;

import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rsc.srm.collection.sortlogic.SortPatientByCountry;
import com.rsc.srm.collection.sortlogic.SortPatientByState;
import com.rsc.srm.model.Patient;

public class MySimpleSort {
	
	public void doComparableSort() {
		List<Patient> lstPat = createPatients();
		
		if ("India".equalsIgnoreCase("india")) {
			Collections.sort(lstPat,new SortPatientByCountry().thenComparing(new SortPatientByState()));
		} else {
			Collections.sort(lstPat,new SortPatientByCountry());
		}

		
		
		
		lstPat.forEach(System.out::println);
	}
	
	private List<Patient> createPatients(){
		Patient p1 = new Patient("1", "India", "Chennai");
		Patient p2 = new Patient("2", "Zambia", "Zimabru");
		Patient p3 = new Patient("3", "Bangladesh", "Dhakka");
		
		List<Patient> lstPatient = new ArrayList<>();
	
		lstPatient.add(p1);
		lstPatient.add(p2);
		lstPatient.add(p3);
		
		return lstPatient;
	}

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(new Integer(56));
		lst.add(45);
		lst.add(4);
		
		Collections.sort(lst,Collections.reverseOrder());
		
		//System.out.println(lst);
		
		new MySimpleSort().doComparableSort();
		
		System.out.println(Thread.currentThread().getId());

	}

}

