package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.PageObjectModel.LoginPom;
import com.Utility.Base;
import com.Utility.Library;

public class VerifyLoginFlipkart_TC001 extends Base
{
	@Test
	public void verifyLogin() throws InterruptedException
	{
		LoginPom login= PageFactory.initElements(driver, LoginPom.class);
		 
//		login.getEmailID().sendKeys("9970997141"); //if we have not  create utility class then we can do like this 
//		login.getPassword().sendKeys("9970997141");
//		login.getSubmitButton().clear();
		
		Library.custome_sendKeys(login.getEmailID(),excel.getStringData("Sheet1", 0, 0), "EmailId");
		Library.custome_sendKeys(login.getPassword(),excel.getStringData("Sheet1", 0, 1), "Password");
		Library.custome_click(login.getSubmitButton(), "Login Button");
		
		
		Thread.sleep(3000);
	}
}
