package com.power.mok;

import com.power.help.AbstractAdderFactoryHelper;

public class AdderFactory extends AbstractAdderFactoryHelper {
	
	public AdderFactory (){
		createAdder();
	}
	
	public void setFourName(String name){
		setName(name);
	}
	
	public String getFourName(){
		//adder.setName(word);
		String resultFromHelper = getTwoNames();
		return resultFromHelper;	
	}
	
	public String getStatic(){
		return getStaticString();
	}


}
