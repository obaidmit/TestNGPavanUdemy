package testngDay3;

import org.testng.annotations.Test;

public class LoginTestsGroups3 {
	
	
	
	@Test(priority=1, groups= {"regression","sanity", "functional"})
	void PaymentRupees()
	{
		System.out.println("this is Payment By Rupees");
	}
	
	
	@Test(priority=2, groups= {"regression", "sanity", "functional"})
	void PaymentDollar()
	{
		System.out.println("this is Payment By Dollar");
	}
	
	
	
	

}
