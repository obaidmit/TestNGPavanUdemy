package testngDay3;

import org.testng.annotations.Test;

public class LoginTestsGroups2 {
	
	
	
	@Test(priority=1, groups= {"sanity"})
	void loginByEmial()
	{
		System.out.println("this is login by Email");
	}
	
	
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by Facebook");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginByTwiter()
	{
		System.out.println("this is login by X");
	}
	
	

}
