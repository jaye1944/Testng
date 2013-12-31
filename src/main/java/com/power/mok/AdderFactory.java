package com.power.mok;

public class AdderFactory {
	private Adder adder;
	
	public AdderFactory(){
		adder = new Adder();
	}
	
	public void setFourName(String word){
		
	}
	
	public String getFourAdder(String word){
		adder.setName(word);
		return adder.getTwoName(word);	
	}

}
