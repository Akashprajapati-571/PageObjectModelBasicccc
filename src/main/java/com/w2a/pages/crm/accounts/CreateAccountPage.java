package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.page;

public class CreateAccountPage extends page{

	
	public void createAccount(String accountName) {
		
		driver.findElement(By.cssSelector("#Crm_Accounts_ACCOUNTNAME")).sendKeys(accountName);
		
	}
}
