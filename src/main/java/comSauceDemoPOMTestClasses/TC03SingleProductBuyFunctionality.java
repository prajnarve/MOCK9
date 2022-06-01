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

public class TC03SingleProductBuyFunctionality extends TestBaseClass 
{	

 @Test
 public void singleProductAddToCart() throws InterruptedException, IOException
   {
    homePagePOMClass hp = new homePagePOMClass(driver);
    
    //single product
    hp.clickBagButton();
    ScreenShotClass.takeScreenshot(driver);
    System.out.println("product is added to cart");
	
    System.out.println("Apply the validation");
    
    String actualResult = hp.getTextFromCartButton();
    
    String expectedResult ="1";

	 ScreenShotClass.takeScreenshot(driver);
		Thread.sleep(8000);
	        
	       System.out.println("verifying the test single product buy  scenario");
	       Assert.assertEquals(actualResult, expectedResult);
  //homePage
    hp.clickMenuButton();
    System.out.println("Clicked on menu button");
    
     hp.clickLogOutButton();
     System.out.println("Clicked on logout button");
   }
 }

        
	

