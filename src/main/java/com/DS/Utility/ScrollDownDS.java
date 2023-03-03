package com.DS.Utility;

import org.openqa.selenium.JavascriptExecutor;

import com.DS.TestBase.DSTestBaseClass;

public class ScrollDownDS extends DSTestBaseClass
{
	public void scrollD() throws InterruptedException 
	{
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("scrollBy(0,500)");  //x=100,y=700
	Thread.sleep(4000);
	
	}


}
