package com.DS.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListenerSetupDS implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test execution started:" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test execution completed:" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test execution failed :" +result.getName());
		UtilityClassDS.screenShots(result.getName()+System.currentTimeMillis());
		System.out.println("Screenshot");

	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test execution skipped :" +result.getName());

	}



}
