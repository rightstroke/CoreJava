package com.rsc.srm.fs.basic.oop.inheritance;

import java.io.Serializable;

abstract public class AutoMobile implements Serializable {
	private short numOfWheels;
	
	private String manuf;
	
	private String vin;
	
	abstract public Boolean isBS6Certified();
	
	
	public AutoMobile(short numOfWheels, String manuf, String vin) {
		super();
		this.numOfWheels = numOfWheels;
		this.manuf = manuf;
		this.vin = vin;
	}

	public void applyBrake(Boolean isBrakeApplied) {
		if (isBrakeApplied) {
			System.out.println("...Stop the car...");
		} else {
			System.out.println("..AM is Still Running..");
		}
	}

	public short getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(short numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	
	
}
