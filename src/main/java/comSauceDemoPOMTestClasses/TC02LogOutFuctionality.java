package comSauceDemoPOMTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.SauceDemo.Utility.ScreenShotClass;

import ComSaucePOMClassesFinal.LoginPagePOMClass;
import ComSaucePOMClassesFinal.homePagePOMClass;

public class TC02LogOutFuctionality  extends TestBaseClass 
{
	    @Test
    public void logOutFunctionality()
    {
    	//homePage
        homePagePOMClass hp = new homePagePOMClass(driver);
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
        
         hp.clickLogOutButton();
         System.out.println("Clicked on logout button");
         
        System.out.println("apply validation");
        
        SoftAssert soft = new SoftAssert();
		

        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
   
        soft.assertEquals(actualUrl, expectedUrl);
		
		//accurate result apply this method
		//compulsory method
		soft.assertAll();

        
       System.out.println("verifying the test logout scenario");
       Assert.assertEquals(actualUrl, expectedUrl);
    }
}
    
    
