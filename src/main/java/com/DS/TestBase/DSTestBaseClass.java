package com.DS.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.DS.PageLayer.AndrewToroInfo;
import com.DS.PageLayer.DSHomePage;
import com.DS.Utility.ScrollDownDS;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DSTestBaseClass 
{
	public static WebDriver driver;
	   public DSHomePage ds;
	   public AndrewToroInfo at;
	   public ScrollDownDS sd;
		
		@BeforeTest
		public void setupApplication() throws InterruptedException
		{
		
			 WebDriverManager.chromedriver().setup();
			   driver=new ChromeDriver();
			 
			driver.manage().window().maximize();
			
			driver.get("https://www.accessibility.com/digital-lawsuits");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();
		
			
			ds = new DSHomePage();
			sd = new ScrollDownDS();
			sd.scrollD();
			Thread.sleep(3000);
			
			ds.clickOnFirst_Lawsuit_Info1();
			Thread.sleep(3000);
			
			at= new AndrewToroInfo();
			
		
			
		}
		
		
		@AfterMethod
		public void closeApplication()
		{
			driver.quit();
			
		}
		

}
