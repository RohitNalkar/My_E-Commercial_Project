package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator 
{
	public static ExtentReports extent;
	
	public static ExtentReports getReports()
	{
		String path ="C:\\Users\\rohit\\eclipse-workspace\\E_Commercial_Project\\Report";
		
		//ExtentSparkReporter ----> set title, ReportName, Theme
		
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("E-Commercial Filikart Project");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System Name","E-Commercial Project" );
		extent.setSystemInfo("Module Name", "Flipkart Module");
		extent.setSystemInfo("QA", "Rohit Nalkar");
		extent.setSystemInfo("OS", "Windows");
		return extent;
	}
	
	
	
}
 