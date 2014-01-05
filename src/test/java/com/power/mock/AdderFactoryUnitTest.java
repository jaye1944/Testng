package com.power.mock;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.power.mok.Adder;
import com.power.mok.AdderFactory;

@PrepareForTest(Adder.class)
public class AdderFactoryUnitTest  extends PowerMockTestCase  {
	@InjectMocks
	private AdderFactory adderFactory = new AdderFactory();
	
	private Adder adder ;
	
	@BeforeTest
	public void setUp() throws Exception {
		adder = PowerMockito.mock(Adder.class);
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testgetFourAdder() throws Exception{
		String actual = "meme";
		String returnActual = "meme";
		String nonStaticActual = "two names";
		mockStatic(Adder.class);	
		when(Adder.rString()).thenReturn(returnActual);
		when(adder.getTwoName()).thenReturn(nonStaticActual);
		
		String expectedToTest = adderFactory.getStatic();		
		String nonStaticExpected = adderFactory.getFourName();
		
		String staticExpectedFromMock  = Adder.rString();
		System.out.println(staticExpectedFromMock);
		
		String nonStaticExpectedFromMock = adder.getTwoName();
		System.out.println(nonStaticExpectedFromMock);
		
//		//static 
		Assert.assertEquals(expectedToTest,actual);
		
		//non static 
		Assert.assertEquals(nonStaticExpected,nonStaticActual);
		
	}

}
