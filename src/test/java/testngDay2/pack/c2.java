package testngDay2.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {
	
	
	@Test
	void abc()
	{
		System.out.println("this is abc of c2 class");
	}
	
	
	@AfterTest
	void at()
	{
		System.out.println("this is After Test Method");
	}
	
	
	

}
