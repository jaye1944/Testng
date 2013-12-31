package com.power.mok;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdderFactory adderFactory = new AdderFactory();
		adderFactory.setFourName("me");
		System.out.println(adderFactory.getFourName());
	}

}
