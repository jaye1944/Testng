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
	
	//static method
	public static String rString(){
		return "I m from static method";
	}
	
	//non final method 
	public String getTwoName() {
		String fourNames = getName() + getName();
		System.out.println("Out put "+fourNames);
		return fourNames;
	}

}
