package com.rsc.srm.fs.basic.oop.inheritance;

public class Car extends AutoMobile {
	
	private String color;
	
	Car(short noOfWheels, String manuf, String vin,String color){
		super(noOfWheels,manuf,vin);
		this.color = color;
	}
	
	public void cruiseControl() {
		System.out.println("Cruise Control has been Activated");
	}

	@Override
	public Boolean isBS6Certified() {
		// TODO Auto-generated method stub
		return "BS5".equals("BS4");
	}

}
