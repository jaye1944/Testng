package com.power.mock;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
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
	
	//@Mock
	//private Adder adder ;
	//final Adder adder = PowerMockito.mock(Adder.class);
	
	@BeforeTest
	public void setUp() throws Exception {
		mockStatic(Adder.class);
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testgetFourAdder() throws Exception{
		String actual = "meme";
		String returnActual = "meme";
		mockStatic(Adder.class);	
		//PowerMockito.doReturn(returnActual).when(Adder.class,"rString");
		when(Adder.rString()).thenReturn(returnActual);
		String expectedToTest = adderFactory.getStatic();
		
		String expected  = Adder.rString();
		System.out.println(expected);
		
//		//final
		Assert.assertEquals(expectedToTest,actual);
		
	}

}
