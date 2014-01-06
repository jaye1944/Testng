package com.power.mock;

import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.doReturn;

import static org.mockito.Matchers.anyString;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.IObjectFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

import com.power.mok.AdderFactory;
import com.power.mok.DpTest;

@PrepareForTest(DpTest.class)
public class AdderFactoryUnitTest {
	//private int k = 0;
	@InjectMocks
	private AdderFactory adderFactory = new AdderFactory();
	
	private DpTest dpTest = PowerMockito.mock(DpTest.class);
	
	@ObjectFactory
    public IObjectFactory getObjectFactory() {
            return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
		
	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {
		//dpTest = PowerMockito.mock(DpTest.class);
		
		//when(dpTest.getAll(anyString())).thenReturn("lolo");
		MockitoAnnotations.initMocks(this);
	}
	
	@DataProvider(name = "test1")
	public static Object[][] DptestData() {
	        return new Object[][] { { 2, "true" }, { 6, "false" }, { 19, "true" },
	        	{ 22, "false" }, { 23, "true" } };
//	        return new Object[][] { { 2, "true" } };
	}
	
	@Test(dataProvider = "test1")
	public void testgetFourAdder(Integer number,String status) throws Exception{
		dpTest = PowerMockito.mock(DpTest.class);
		//doReturn("mocked done!").when(dpTest,"getAll",anyString());
		when(dpTest.getAll(anyString())).thenReturn("mocked done!");
//		String stringt = (String) status;
//		Integer numt = (Integer)number;
		dpTest.setNumber(number);
		dpTest.setStstus(status);
		
		System.out.println(number);
		System.out.println(status);
		
		System.out.println(dpTest.getAll("lol"));
		System.out.println();
		
		
//		String actual = "meme";
//		String returnActual = "meme";
//		mockStatic(Adder.class);	
//		//PowerMockito.doReturn(returnActual).when(Adder.class,"rString");
//		when(Adder.rString()).thenReturn(returnActual);
//		String expectedToTest = adderFactory.getStatic();
//		
//		String expected  = Adder.rString();
//		System.out.println(expected);
		
//		//final
		//Assert.assertEquals(expectedToTest,actual);
		
	}

}
