package com.acti.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript {
	
//**************************Page Elements****************************//	
	
	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]") WebElement custNameTBox;	
	
//**********************Page Initialization**************************//		
	
	public TaskListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//*********************Page Actions/Methods*************************//	
	
	public void clickAddNewButton()
	{
		addNewButton.click();
	}
	
	public void clickNewCustomerItem()
	{
		newCustomerItem.click();
	}
	
	public void enterCustomerName(String customerName)
	{
		custNameTBox.sendKeys(customerName);
	}
	

}
