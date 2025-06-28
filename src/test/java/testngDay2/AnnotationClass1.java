package testngDay2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationClass1 {
	
	
	@BeforeMethod
	void login()
	{
		System.out.println("login first method");
	}
	
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search method");

	}
	
	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("advance search method");

	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout method");

	}
	

}
