package comSauceDemoPOMTestClasses;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.SauceDemo.Utility.ScreenShotClass;
import ComSaucePOMClassesFinal.LoginPagePOMClass;
import ComSaucePOMClassesFinal.homePagePOMClass;

public class TC01LoginFunction extends TestBaseClass 
{
	
    @Test
    public void loginFunctionality()
    {
    	//homePage
        homePagePOMClass hp = new homePagePOMClass(driver);
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
        
         hp.clickLogOutButton();
         System.out.println("Clicked on logout button");
         
        System.out.println("apply validation");
        
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
        
       System.out.println("verifying the test login scenario");
       Assert.assertEquals(actualUrl, expectedUrl);
    }
}
