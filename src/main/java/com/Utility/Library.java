package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library 
{	
	public static ExtentTest test;
	public static void custome_sendKeys(WebElement element, String value, String fildName)
	{
		try
		{
		if(element.isDisplayed() && element.isEnabled())
		{
			element.sendKeys(value);
		}
			test.log(Status.PASS,fildName + "== Value Succesfully send =="+ value);
		}
		catch (Exception e)
		{
			test.log(Status.FAIL,fildName + "== Value Unable to send =="+ value);
		}
	}
	
	public static void custome_click(WebElement element, String fildName)
	{
		if(element.isEnabled())
		{
			element.click();
			test.log(Status.PASS,fildName + "== Click Succesfully");
		}
		else
		{
			test.log(Status.FAIL,fildName + "== Unable to click");
		}
	}
}
