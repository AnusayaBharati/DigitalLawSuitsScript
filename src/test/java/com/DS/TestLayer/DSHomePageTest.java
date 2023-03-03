package com.DS.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS.TestBase.DSTestBaseClass;

public class DSHomePageTest extends DSTestBaseClass
{
	 
		@Test
		public void HomeTest() throws InterruptedException 
		   {
			String expected="https://www.accessibility.com/digital-lawsuits";
			String actual = ds. getCUrl();
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
		   }

}
