package testngDay5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




//@Listeners(testngDay5.ListenerClass.class)
public class OrangeHRM {
	
	
	WebDriver driver;
	

	@BeforeClass
	void setup() throws InterruptedException {
		
		//driver= new EdgeDriver(); 
		
		driver= new ChromeDriver();
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
		Assert.assertEquals(driver.getTitle(), "OrangeHRMM");
	}
	
	@Test(priority=3)
	void testUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority=4, dependsOnMethods= {"testTitle"})
	void loginText()
	{
		String loginText= driver.findElement(By.xpath("//h5[normalize-space()='Login']")).getText();
		Assert.assertEquals(loginText,"Login");
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();;
	}
	
}
	
	
	


