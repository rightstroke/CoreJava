package com.rsc.srm.fs.basic;

public class MyTestClass {

	public static void main(String[] args) {
		MyImmutableClass myImm = new MyImmutableClass();
		myImm.setAge(45);
		myImm.setName("Annamalai");
		
		String[] names = myImm.doSomething();
		names[1] = "Kalaiyan";

	}

}
