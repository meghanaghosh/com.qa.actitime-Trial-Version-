package com.acti.testcase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {
	
	@Test(priority=0)
	public void verifyLoginPage()
	{
		String actual="actiTIME - Login";
		String title = loginPage.verifyLoginPageTitle();
		//System.out.println(title);
		Assert.assertEquals(title, actual);
		
	}
	
	@Test(priority=2)
	public void validateLoginFunctionality()
	{
		loginPage.validateLoginFunction("admin", "manager");
		enterTimePage.clickLogout();
	}
	
	@Test(priority=1)
	public void verifyActiLogo()
	{
		boolean flag = loginPage.verifyActiLogo();
		Assert.assertTrue(flag);
	}


}
