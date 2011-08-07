package com.seitenbau.android.sdcplanner.beans;

import java.io.Serializable;

public class Room implements Serializable{
	
	private String name;

	public Room(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
