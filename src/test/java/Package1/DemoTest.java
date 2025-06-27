package Package1;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoTest {
	
	
	
	@BeforeMethod
	  void before()
	{
		System.out.println("First and New TestNG Tutorial by Pavan Udemy!");
	}
	
	@Test
	 void Test()
	{
		System.out.println("Test");
	}
	
	 @AfterMethod
	void TestDemo()
	{
		System.out.println("method");
	}

}
