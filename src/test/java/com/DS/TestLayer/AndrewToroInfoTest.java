package com.DS.TestLayer;

import org.testng.annotations.Test;
import com.DS.Utility.ScrollDownDS;

import com.DS.TestBase.DSTestBaseClass;

public class AndrewToroInfoTest extends DSTestBaseClass
{
	@Test
	public void AndrewToroInfoTest() throws InterruptedException 
	{
		ScrollDownDS sd = new ScrollDownDS();
		sd.scrollD();
		Thread.sleep(3000);
		
		at.Plaintiff_Get_Text();
		Thread.sleep(3000);
		
		at.Defendent_Get_Text();
		Thread.sleep(3000);
		
		/*String expected = new String("Plaintiff Name: ANDREW TORO Filing date: January 31, 2023 State of filing:New York");
		
		String actual = at.Plaintiff.getText();
		
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);*/
	 
		
	}

}
