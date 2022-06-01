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

public class TC04MultiProductFunctionality extends TestBaseClass 
{
   @Test
   public void multipleProductAddToCart() throws IOException, InterruptedException
   {     
        //all product select.
        homePagePOMClass hp = new homePagePOMClass(driver);
        hp.addAllProduct();

   	
        System.out.println("all products are added to cart");
		
        //validation
        System.out.println("apply the validation");
        
       String actualResult = hp.getTextFromCartButton();
       String expctedResult = "6";
       ScreenShotClass.takeScreenshot(driver);
       Thread.sleep(3000);
       ScreenShotClass.takeScreenshot(driver);
		Thread.sleep(8000);
	        
	       System.out.println("verifying the test multi product buy  scenario");
	       Assert.assertEquals(actualResult,expctedResult);
       hp.clickMenuButton();
       System.out.println("Clicked on menu button");
       
        hp.clickLogOutButton();
        System.out.println("Clicked on logout button");
        Thread.sleep(3000);
 	   ScreenShotClass.takeScreenshot(driver);
}
}