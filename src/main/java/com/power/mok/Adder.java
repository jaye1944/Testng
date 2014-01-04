package com.power.mok;

public final class Adder {
	private String name;
	
	public Adder(){
		
	}
	
	public  String getName() {
		return name+name;
	}

	public  void setName(String name) {
		this.name = name;
	}
	//mocked final method
	public final String getTwoName() {
		String fourNames = getName() + getName();
		System.out.println("mock is not correct ");
		//System.out.println("Out put "+fourNames);
		return fourNames;
	}

}
