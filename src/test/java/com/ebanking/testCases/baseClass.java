package com.ebanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ebanking.testData.ReadTestData;

public class baseClass {
	
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		//WebDriver driver = new ChromeDriver();
		driver.get(new ReadTestData().getUrl());
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreenShot() throws IOException
	{
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(screenshot, new File("./ScreenShots/"+getDateTime()+ ".png"));
	}
	public static String getDateTime() 
	{
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   return dtf.format(now);  
}

}
