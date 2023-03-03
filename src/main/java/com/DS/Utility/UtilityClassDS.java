package com.DS.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.DS.TestBase.DSTestBaseClass;

public class UtilityClassDS extends DSTestBaseClass
{
	public UtilityClassDS() 
	{
		PageFactory.initElements(driver,this);
		
	}
	public static void screenShots( String filename) 
	{
	String path = ("C:\\Users\\Lenovo\\eclipse-workspace\\DigitalLawSuitsScript\\Screenshots\\");
	
	try
	{TakesScreenshot ts = ((TakesScreenshot)driver);
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File(path + filename+".png") ;
	FileHandler.copy(source, destination);

	
	}
	catch (IOException e) 
	{
		e.printStackTrace();
		System.out.println("Please provide correct path");
	}
	
	}

}
