package com.power.mock;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyString;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;




//Before
import org.testng.annotations.BeforeTest;
//import org.junit.Before;

import org.testng.annotations.ObjectFactory;
//Test
import org.testng.annotations.Test;
//import org.junit.Test;

//Assert
import org.testng.Assert;
//import org.junit.Assert;

import org.testng.IObjectFactory;

import com.power.mok.Adder;
import com.power.mok.AdderFactory;

//@RunWith(PowerMockRunner.class)
@PrepareForTest(Adder.class)
public class AdderFactoryUnitTest  {
	
	@InjectMocks
	private AdderFactory adderFactory;
	
	@ObjectFactory
	public IObjectFactory getObjectFactory() {
		return new org.powermock.modules.testng.PowerMockObjectFactory();
	}
	
	/*
	 * Adder.java ordinary class with final method
	 */
	private Adder adder = PowerMockito.mock(Adder.class);
	
	@BeforeTest
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testgetFourAdder() throws Exception{
		String expected = "mock done succsefully";
		String actualReturn = "mock done succsefully";
		
		when(adder.getTwoName()).thenReturn(actualReturn);
		
		String actual = adderFactory.getFourName();
		
		String mockResult = adder.getTwoName();		
		//System.out.println(adder.getClass().toString());
		System.out.println("mock result - "+mockResult);
		System.out.println("expected - "+ expected);
		
		//Testng 
		Assert.assertEquals(expected,actual);
		
		
		
	}

}
