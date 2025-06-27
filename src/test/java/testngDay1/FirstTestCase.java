package testngDay1;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("open application");
	}
	
	
	@Test(priority=2)
	void launchapp()
	{
		System.out.println("launch application");

	}
	
	
	@Test(priority=3)
	void closeapp()
	{
		System.out.println("close application");
		System.out.println("closing window");

	}

}
