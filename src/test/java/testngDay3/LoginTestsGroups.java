package testngDay3;

import org.testng.annotations.Test;

public class LoginTestsGroups {
	
	
	
	@Test(priority=1, groups= {"regression"})
	void SignUpByFacebook()
	{
		System.out.println("this is sign up by Facebook");
	}
	
	
	@Test(priority=2, groups= {"regression"})
	void SignUpByTwiter()
	{
		System.out.println("this is Sign up by X");
	}
	
	@Test(priority=3, groups= {"regression"})
	void SignUpEmail()
	{
		System.out.println("this is Sign up by Email");
	}
	
	

}
