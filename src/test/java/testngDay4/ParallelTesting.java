package testngDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	void setup(String br) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver= new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		default: System.out.println("Invalid browser");return;
		}
		
		
		//driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
	}

	
	@Test(priority=1)
	void testLogo()
	{
		boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=3)
	void testUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();;
	}
	
}











//img[@alt='company-branding']
//input[@placeholder='Username']
//input[@placeholder='Password']
//button[normalize-space()='Login']
