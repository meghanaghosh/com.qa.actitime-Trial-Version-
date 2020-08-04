package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;

public class BaseTest extends DriverScript {
	
	
	BaseTest()
	{
		super(); //Super keyword is used to call the parent class constructor
	}
	
	LoginPage loginPage;
	EnterTimePage enterTimePage;
	TaskListPage taskListPage;

	@BeforeMethod
	public void beforeTest()
	{
		initBrowser();
		loginPage = new LoginPage();
		enterTimePage=new EnterTimePage();
		taskListPage = new TaskListPage();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
