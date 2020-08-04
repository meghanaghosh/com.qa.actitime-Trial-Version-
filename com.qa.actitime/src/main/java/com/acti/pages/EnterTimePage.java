package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Script Name : EnterTimePage
 * Created By : Meghana
 *  Date Created : 07/31/2020
 *  Verified By : Meghana
 */

public class EnterTimePage extends DriverScript {
	
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(xpath="//div[@id='container_tasks']") WebElement taskMenu;
	
//**************************Page Elements****************************//	
	public EnterTimePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
//**********************Page Initialization**************************//	

	public void clickLogout()
	{
		logoutLink.click();
	}

//*********************Page Actions/Methods*************************//	

	public void clickTaskMenu()
	{
		taskMenu.click();
	}
	
}
