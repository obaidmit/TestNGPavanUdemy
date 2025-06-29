parallel testing  using xml file
===============================
1) created test case
2) created xml file to run the test case
3) passed browser name parameter xml file and recieved in setup() method
  
  4) run only through xml file suite
  5) execute test case on 	chrome, edge, firefox (sequential execution)
  
  	<parameter name="browser" value="chrome"></parameter>

void setup(String br) throws InterruptedException
	{
		switch(br)
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver= new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		default: System.out.println("Invalid browser");return;
		}
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();