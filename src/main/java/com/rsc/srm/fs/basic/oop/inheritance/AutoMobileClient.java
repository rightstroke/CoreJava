package com.rsc.srm.fs.basic.oop.inheritance;

public class AutoMobileClient {
	
	public static void main(String[] args) {
		short wheels = 4;
		//Car car = new Car(wheels,"Suzuki","Vin12332","RED");
		//System.out.println(car.getVin());
		//System.out.println(car.getNumOfWheels());
		
		//car.applyBrake(Boolean.FALSE);
		
		//car.cruiseControl();
		
		//System.out.println("====");
		
		AutoMobile genericAutoMobile = new Car(wheels,"Tata","Vin45454","Blue");
		//System.out.println(genericAutoMobile.getManuf());
		//System.out.println(genericAutoMobile.getManuf());
		//genericAutoMobile.applyBrake(false);
		
		Car c = (Car)genericAutoMobile;
		//c.cruiseControl();
		
		short bWheels=6;
		
		AutoMobile genericAutoMobile2 = new Bus(bWheels,"BharatBenz","VIN67572");
		
		
		Bus bus = (Bus)genericAutoMobile2;
		//System.out.println(bus.isSchoolBus());
		
		System.out.println("======================================================");
		
		AutoMobile[] ams = new AutoMobile[3];
		ams[0] = genericAutoMobile;
		ams[1] = genericAutoMobile2;
		ams[2] = new Truck(wheels,"Suzuki","Vin12332");
		
		processAMS(ams);
		
		//AutoMobile amnew = new AutoMobile((short)4, "manuf", "vin");
	}
	
	public static void processAMS(AutoMobile[] ams) {
		for(AutoMobile am : ams) {
			if (am instanceof Car) {
				Car c = (Car)am;
				c.cruiseControl();
			}else {
				Bus b = (Bus)am;
				//Bus b = (Car)am;
				System.out.println(b.isSchoolBus());
			}
			
			
		}
	}

}
