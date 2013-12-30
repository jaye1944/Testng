package com.power.mok;

public class Adder {
	private String name;
	
	public Adder(){
		
	}
	
	//mocked method 1
	public  String getName() {
		return name+name;
	}

	public  void setName(String name) {
		this.name = name;
	}
	//mocked method 2
	public final String getTwoName() {
		return getName();
	}

}
