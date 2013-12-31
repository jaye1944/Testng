package com.power.mock;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyString;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;


//Before
import org.testng.annotations.BeforeTest;
//import org.junit.Before;

//Test
import org.testng.annotations.Test;
//import org.junit.Test;

//Assert
import org.testng.Assert;
//import org.junit.Assert;

import com.power.mok.Adder;
import com.power.mok.AdderFactory;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Adder.class)
public class AdderFactoryUnitTest {
	@InjectMocks
	private AdderFactory adderFactory;
	
//	@Mock
//	private Adder adder ;
	private Adder adder = PowerMockito.mock(Adder.class);
	
	@BeforeTest
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testgetFourAdder(){
		String actual = "meme";
		String halfActual = "meme";
		
//		//final
		when(adder.getTwoName()).thenReturn(halfActual);
		
		String expected = adderFactory.getFourName();
		
		String mockResult = adder.getTwoName();		
		//System.out.println(adder.getClass().toString());
		System.out.println("mock result - "+mockResult);
		System.out.println("expected - "+ expected);
		
//		//Testng 
		Assert.assertEquals(expected,actual);
		//junit
		
		
		
	}

}
