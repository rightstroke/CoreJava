package com.rsc.srm.fs.basic.oop.inheritance;

public class Bus extends AutoMobile {
	
	int color;
	
	public final String Color_Code;
	
	Bus(short numOfWheels, String manuf, String vin){
		super(numOfWheels, manuf,  vin);
		Color_Code = "blue";
	}

	
	public Boolean isSchoolBus() {
		return false;
	}

	@Override
	public Boolean isBS6Certified() {
		// TODO Auto-generated method stub
		return true;
	}
}
