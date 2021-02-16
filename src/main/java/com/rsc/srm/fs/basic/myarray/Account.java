package com.rsc.srm.fs.basic.myarray;

import java.io.Serializable;

//Marker Interface

public class Account implements Serializable {

	//private static final long serialVersionUID = -8578815095222010709L;

	private int id;
	
	private String name;
	
	

	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
