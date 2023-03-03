package com.DS.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DS.TestBase.DSTestBaseClass;

public class DSHomePage extends DSTestBaseClass
{
	public DSHomePage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//a[contains(text(),'ANDREW TORO v. Atwood Distributing, L.P.')]")
	private WebElement First_Lawsuit_Info1;
	
	public void clickOnFirst_Lawsuit_Info1() 
	{
		First_Lawsuit_Info1.click();
	}
	
	public String getCUrl() 
	{
		String url=driver.getCurrentUrl();
		return url;
	}

}
