package com.power.mok;

public class DpTest {
	private String ststus;
	private int number;
	
	public DpTest(String ststus, int number) {
		super();
		this.ststus = ststus;
		this.number = number;
	}

	public String getStstus() {
		return ststus;
	}

	public void setStstus(String ststus) {
		this.ststus = ststus;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public final String getAll(String all){
		return ststus + String.valueOf(number);
	}
	
	

}
