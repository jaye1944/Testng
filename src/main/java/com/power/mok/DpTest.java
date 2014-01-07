package com.power.mok;

public class DpTest {
	private boolean ststus;
	private int number;
	
	public DpTest() {
	//	super();

	}

	public boolean getStstus() {
		return ststus;
	}

	public void setStstus(boolean ststus) {
		this.ststus = ststus;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public final boolean getAll(){
		System.out.println("mock me");
		return ststus;
	}
	
	

}
