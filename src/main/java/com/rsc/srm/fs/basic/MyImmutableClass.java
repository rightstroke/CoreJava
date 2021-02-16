package com.rsc.srm.fs.basic;

public final class MyImmutableClass {
	//input1
	private String name;
	
	//input2
	private Integer age;
	
	private String someInternalSensitiveVariabe;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String[] doSomething() {
		//
		
		String[] names = new String[] {"Kala","Kabali"};
		
		return names.clone();
	}
	
	
}
