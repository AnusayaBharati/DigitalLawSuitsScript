package com.DS.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.DS.TestBase.DSTestBaseClass;

public class AndrewToroInfo extends DSTestBaseClass
{
	public static WebElement Plaintiff;
	public static WebElement Defendent;
	//public static String Filing_date;
	//public static String State_of_filing;
	
	public AndrewToroInfo() 
	{
		Plaintiff= driver.findElement(By.xpath("//div[@class='plaintiff_content']"));
		Defendent = driver.findElement(By.xpath("//div[@class='defendant_content']"));
		
	}
	
	public void Plaintiff_Get_Text() 
	{
		String Info =  Plaintiff.getText();
	    System.out.println(Info);
		
	}
	
	public void Defendent_Get_Text() 
	{
		String DefInfo = Defendent.getText();
		System.out.println(DefInfo);
	}
	
	

}
