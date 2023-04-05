package com.ebanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver localdriver;
	
	//page constructor
	public LoginPage(WebDriver remotedriver)
	{
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	//page elements
	@FindBy(xpath = "//input[@name='uid']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	//actions
	public void setUserName(String uName)
	{
		txtUsername.sendKeys(uName);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
}
