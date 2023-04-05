package com.ebanking.testData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadTestData {

	Properties prop;
	//String path = "./src/test/resources/testData.properties";
	String path = "C:\\Users\\12262\\eclipse-workspace\\e-banking\\src\\test\\resources\\data.properties";
	
	public ReadTestData()
	{
		File src = new File(path);
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getUsername()
	{
		return prop.getProperty("ValidUserName");
	}
	public String getPassword()
	{
		return prop.getProperty("ValidPassword");
	}
	public String getUrl()
	{
		return prop.getProperty("BaseUrl");
	}
	public String homePageTitle()
	{
		return prop.getProperty("homePageTitle");
	}
	
	
}
