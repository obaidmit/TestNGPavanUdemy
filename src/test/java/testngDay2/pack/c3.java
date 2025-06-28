package testngDay2.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	
	
	@Test
	void pqr()
	{
		System.out.println("this is prq of c3 ");
	}
	
	
	
	
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("this is before Suite");
	}
	
	@AfterSuite
	void afterSuite()
	{
		System.out.println("this is after Suite");
	}


}
