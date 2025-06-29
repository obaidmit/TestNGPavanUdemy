package testngDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="DP")
	void testLogin(String email, String pass) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		
		boolean status= driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
			
		
		


	}

	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
	
//	@DataProvider(name="DP", indices= {0,2})    //indices means which data only takes input and execute 0,1,2,3,4...
	@DataProvider(name="DP")
	Object[][] logindata()
	{
		Object data[][]= {
				{"abc@gmail.com", "test123"},
				{"xyz@gmail.com", "test012"},
				{"john@gmail.com","test@123"} ,
				{"pavanol123@gmail.com","test@123"},
				{"ShaanK@gmail.com","Shaan@12345"},
				{"johncanedy@gmail.com","test"},				
						};
		return data;
		
		
	}
}
