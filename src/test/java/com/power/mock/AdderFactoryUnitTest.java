package com.power.mock;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Matchers.anyString;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.testng.annotations.BeforeTest;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.mock;

import com.power.mok.Adder;
import com.power.mok.AdderFactory;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Adder.class)
public class AdderFactoryUnitTest {
	@InjectMocks
	private AdderFactory adderFactory;
	
	//@Mock
	//final Adder adder = mock(Adder.class);
	final Adder adder = PowerMockito.mock(Adder.class);
	
	@BeforeMethod
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testgetFourAdder(){
		String actual = "memememe";
		String actual2 = "meme";
		String halfActual = "meme";
		
		//not final
		when(adder.getTwoName(anyString())).thenReturn(halfActual);
		
//		//final
//		when(adder.getTwoName(anyString())).thenReturn(halfActual);
		
		String expected = adderFactory.getFourAdder("abcdefg");
		System.out.println(expected);
		//not final
		Assert.assertEquals(expected,actual2);
		
//		//final
//		Assert.assertEquals(expected,actual);
		
	}

}
