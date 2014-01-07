package com.power.mock;

import static org.powermock.api.mockito.PowerMockito.when;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
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
	@InjectMocks
	private AdderFactory adderFactory = new AdderFactory();
	
	private DpTest dpTest = PowerMockito.mock(DpTest.class);
	
	@ObjectFactory
    public IObjectFactory getObjectFactory() {
            return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
		
	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@DataProvider(name = "test1")
	public static Object[][] DptestData() {
	        return new Object[][] { { 2, true,true }, { 6, false,false }, { 19, true,true },
	        	{ 22, false,false }, { 23, true,true } };
//	        return new Object[][] { { 2, true, true } };
	}
	
	@Test(dataProvider = "test1")
	public void testgetFourAdder(Integer number,Boolean status,Boolean actualStatus) throws Exception{
		/*
		 * dpTest = PowerMockito.mock(DpTest.class); is comment you can see that one test is working (1 st one)
		 * 
		 */
		dpTest = PowerMockito.mock(DpTest.class);
		
		when(dpTest.getAll()).thenReturn(actualStatus);
		
		System.out.println(number);
		System.out.println(status);
		
		System.out.println(adderFactory.getBool());
		Boolean expectedStatus = adderFactory.getBool();
		System.out.println();
		Assert.assertEquals(actualStatus,expectedStatus);

		
	}

}
