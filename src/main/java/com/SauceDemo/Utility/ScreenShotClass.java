package com.SauceDemo.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & hh-mm-ss");
		String date = d1.format(d);
		System.out.println(date);
		
	  
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File sourceFile =	ts.getScreenshotAs(OutputType.FILE);	
	   File destFile = new File("./Screenshots/"+date+" "+".jpg");
	   FileHandler.copy(sourceFile, destFile);	
	   System.out.println("screenshot is taken");

	}
}