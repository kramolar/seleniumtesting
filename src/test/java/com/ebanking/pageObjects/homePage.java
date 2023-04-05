package com.ebanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

WebDriver localdriver;
	
	//page constructor
	public homePage(WebDriver remotedriver)
	{
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	@FindBy(xpath="//marquee")
	WebElement pageTitle;
	
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement newCustomer;
	
	public String getPageTitle()
	{
		return pageTitle.getText();
	}
	public void newCustomer()
	{
		newCustomer.click();
	}
	
}
