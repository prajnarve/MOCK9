package comSauceDemoPOMTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(com.SauceDemo.Utility.ListenerClass.class)
public class SampleClass1
{
	public WebDriver driver;
//	@Test
//	public void verifyLoginUrl()
//	{
//		Assert.assertTrue(true);          //pass
//	}
//	
//	@Test
//	public void verifyLoginTitle()
//	{
//		Assert.assertTrue(false);          //fail
//	}
	
	
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", 
				"./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(false);
	}
}
