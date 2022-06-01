package comSauceDemoPOMTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ComSaucePOMClassesFinal.LoginPagePOMClass;

public class TestBaseClass 
{
    WebDriver driver;
	
    @Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName)
	{
    	if(browserName.equals("chrome"))
		{
    		System.setProperty("webdriver.edge.driver", 
    				"C:\\Users\\lenovo\\OneDrive\\Desktop\\cromedriver\\New folder\\msedgedriver.exe");
    			driver = new EdgeDriver();
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\OneDrive\\Desktop\\cromedriver\\New folder\\chromedriver.exe");
//			driver = new ChromeDriver();
		}
		else
	{
		
		System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\lenovo\\OneDrive\\Desktop\\cromedriver\\New folder\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
		
		
		//remaining code will stay as it is
		System.out.println("browser open");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        //login 
        LoginPagePOMClass lp = new LoginPagePOMClass(driver);
        
        lp.sendUsername();       //username
        System.out.println("Enter the username");
        
        lp.sendPassword();       //password
        System.out.println("Enter the password");
        
        lp.clickLoginButton();   //login click
        System.out.println("CLick on login button");
   }
	
	 @AfterMethod
	   public void tearDown() throws IOException
	   {
	        //logout
	       driver.quit();
	       System.out.println("End of program");	
		}

}