package com.rsc.srm.fs.basic.oop.inheritance;

public class Truck extends AutoMobile {

	public Truck(short numOfWheels, String manuf, String vin) {
		super(numOfWheels, manuf, vin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean isBS6Certified() {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}

}
