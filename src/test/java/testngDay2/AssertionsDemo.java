package testngDay2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	
	@Test
	void testTitle()
	{
		String expected_tit= "opencart";
		String actual_tit= "opencart";
		
		/*
		if(expected_tit.equals(actual_tit))
		{
			System.out.println("Test pased");
		}
		else
		{
			System.out.println("test failed");
		}
		
		*/
		
		Assert.assertEquals(expected_tit, actual_tit);
	}

}
