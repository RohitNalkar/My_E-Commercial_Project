package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;

	public ConfigDataProvider() throws Exception
	{
		//Here we loading the Config.Properties file
		String path="C:\\Users\\rohit\\eclipse-workspace\\E_Commercial_Project\\Config\\Config.Properties";
		
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getStageUrl() 
	{
		return pro.getProperty("StageUrl");
	}
}
