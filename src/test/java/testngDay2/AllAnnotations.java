package testngDay2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	void aftersuite()
	{
		System.out.println("after suite");
	}
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("after test");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("before test method");
	}
	
	
	@AfterMethod
	void afterMethod()
	{
		System.out.println("after test method");
	}
	
	@BeforeClass
	void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("after class");
	}
	
	@Test(priority=1)
	void Test1()
	{
		System.out.println("Test 1");
	}
	
	
	@Test(priority=2)
	void Test2()
	{
		System.out.println("Test 2");
	}

}
