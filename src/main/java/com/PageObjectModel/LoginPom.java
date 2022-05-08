package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPom 
{
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement emailID;
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement submitButton;

	public WebElement getEmailID() 
	{
		return emailID;
	}

	public void setEmailID(WebElement emailID) 
	{
		this.emailID = emailID;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public void setPassword(WebElement password) 
	{
		this.password = password;
	}

	public WebElement getSubmitButton() 
	{
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) 
	{
		this.submitButton = submitButton;
	}

	
	
	

}
