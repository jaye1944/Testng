package com.power.help;
import com.power.mok.Adder;

public abstract class AbstractAdderFactoryHelper {
	private Adder adder;
	
	protected void createAdder(){
		adder = new Adder();
	}
	
	protected String getTwoNames(){
		return adder.getTwoName();
	}
	
	protected String getStaticString(){
		return Adder.rString();
	}
	
	protected void setName(String name){
		adder.setName(name);
	}

}
