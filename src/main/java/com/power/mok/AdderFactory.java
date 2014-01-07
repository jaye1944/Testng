package com.power.mok;


public class AdderFactory  {
	private DpTest dpTest;
	public AdderFactory (){
		dpTest = new DpTest();
		//dpTest.setStstus(true);
	}
	
	public boolean getBool(){
		dpTest.setStstus(true);
		return dpTest.getAll();
	}


}
