package com.rsc.srm.collection.generics;

public class MySpecialGeenrics {

	public static void main(String[] args) {
		SpecialBound<IPhone> speBound = new SpecialBound(new IPhone());
		speBound.signal1();
		speBound.signal2();
	}
	
	

}

interface SwitchControls {
	public void on();
	
	public void off();
}

class IPhone implements SwitchControls {

	@Override
	public void on() {
		System.out.println(":::ON:::");
		
	}

	@Override
	public void off() {
		System.out.println(":::OFF:::");
		
	}
}

class Android extends IPhone implements SwitchControls {

	@Override
	public void on() {
		System.out.println(":::ON:::");
		
	}

	@Override
	public void off() {
		System.out.println(":::OFF:::");
		
	}
}

class SpecialBound<T extends IPhone & SwitchControls> {
	T obj;
	
	SpecialBound(T obj) {
		this.obj = obj;
	}
	
	public void signal1() {
		this.obj.on();
	}
	
	public void signal2() {
		this.obj.off();
	}
	
}
