package com.power.mok;

public class Adder {
	private String name;
	
	public Adder(){
		
	}
	
	public  String getName() {
		return name+name;
	}

	public  void setName(String name) {
		this.name = name;
	}
	//mocked method 2
	public final String getTwoName() {
		String fourNames = getName() + getName();
		System.out.println("Out put "+fourNames);
		return fourNames;
	}

}
