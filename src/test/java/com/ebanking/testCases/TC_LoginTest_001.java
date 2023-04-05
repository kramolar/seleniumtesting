package com.ebanking.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.pageObjects.LoginPage;
import com.ebanking.pageObjects.homePage;
import com.ebanking.testData.ReadTestData;

public class TC_LoginTest_001 extends baseClass{

	@Test
	public void loginTest() throws IOException
	{
		new LoginPage(driver).setUserName(new ReadTestData().getUsername());
		new LoginPage(driver).setPassword(new ReadTestData().getPassword());
		new LoginPage(driver).clickSubmit();
		//Assert.assertEquals(new homePage(driver).getPageTitle(), new ReadTestData().homePageTitle());
		
		if(new homePage(driver).getPageTitle().equals(new ReadTestData().homePageTitle()))
		{
			Assert.assertTrue(true);
			captureScreenShot();
		}
		else
		{
			captureScreenShot();
			Assert.assertTrue(false);
		}
	}
	
	
}
