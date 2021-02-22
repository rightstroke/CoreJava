package com.rsc.srm.j8.streams;

public class MyCarImpl {
	
	public ICar myImpl() {
		ICar myCar = ()-> {
			System.out.println("Car Auto Driving Mode.....");
		};
		
		return myCar;
	}
	
	public IBike myImpl2() {
		IBike iB = (x) -> {
			Integer result = x + 100;
			return result.toString().concat("::Litres");
		};
		return iB;
	}

	public static void main(String[] args) {
		//new MyCarImpl().myImpl().statDrive();
		System.out.println(new MyCarImpl().myImpl2().addPetro(75));
	}

}
