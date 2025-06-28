package testngDay2.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	
	
	@Test
	void xyz()
	{
		System.out.println("this is xyz of c1 ");
	}
	
	
	
	
	
	@BeforeTest
	void bt()
	{
		System.out.println("this is before TEST Method");
	}

}
