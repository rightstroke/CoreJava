package com.rsc.srm.fs.basic;

public abstract class BaseModel {
	
	public BaseModel(int id) {
		this.id = id;
	}
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
