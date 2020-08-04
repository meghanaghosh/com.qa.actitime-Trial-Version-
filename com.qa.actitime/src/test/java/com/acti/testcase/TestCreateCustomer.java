package com.acti.testcase;

import org.testng.annotations.Test;

public class TestCreateCustomer extends BaseTest {
	
	
	@Test
	public void testCreateCustomer() throws Exception
	{
		loginPage.validateLoginFunction("admin", "manager");
		enterTimePage.clickTaskMenu();
		taskListPage.clickAddNewButton();
		taskListPage.clickNewCustomerItem();
		taskListPage.enterCustomerName("Testing Customer");
		Thread.sleep(3000);
		enterTimePage.clickLogout();
	}

}
