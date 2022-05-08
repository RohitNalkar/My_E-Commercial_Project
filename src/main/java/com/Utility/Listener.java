package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends Base implements ITestListener
{
	ExtentReports extent =ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extTest=new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) 
	{
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extTest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) 
	{
		extTest.get().log(Status.PASS, "Test Case Pass");
		extTest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestFailure(ITestResult result) 
	{
		extTest.get().log(Status.FAIL, "Test Case Pass");
		extTest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) 
	{
		extTest.get().log(Status.SKIP, "Test Case Pass");
	}

	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}
	
	public String getScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 return ts.getScreenshotAs(OutputType.BASE64);
	}
}
