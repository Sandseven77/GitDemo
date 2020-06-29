package BroooklynCollege.Mavenjava;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test(groups= {"Smoke"})
	public void NativeAppAndroid()
	{
		System.out.println("NativeAppAndroid");
	}
	
	@Test(groups= {"Smoke"})
	public void IOSApp()
	{
		System.out.println("IOSApp");
	}
	
}
