package com.acti.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.acti.base.DriverScript;
import com.mongodb.MapReduceCommand.OutputType;

public class Helper extends DriverScript{
	
	/* 
	 *  This method is used to support the wait wherever needed
	*/
	
	 public static void sleep()
	 {
	    try
	    { 
			Thread.sleep(2000); 
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	 }
	
	/* 
	 * This method is used to capture the screenshot
	
    
	 public static String captureScreen(WebDriver driver)
	 {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.)
				//.getScreenshotAs(OutputType.FILE);
		String dest = "./reports/screens/acti.png"; 
		try 
	    { 
	      FileHandler.copy(src, new File(dest)); 
	    } 
		catch (IOException e) 
	    { 
	       e.printStackTrace(); 
	    } 
	    return dest; 
     }
	 */
}
