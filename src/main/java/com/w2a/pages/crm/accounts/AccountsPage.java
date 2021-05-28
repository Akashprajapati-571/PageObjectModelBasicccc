package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.page;

public class AccountsPage extends page{

	public CreateAccountPage CreateAccount() {
		
		//driver.findElement(By.cssSelector("#table_row_1 > lyte-td.alignRight > span.customPluswithImpotBtnCon.pR.cPlusImportButton.vam > link-to > button")).click();
		driver.findElement(By.cssSelector(".customPlusBtn")).click();
		
	return new CreateAccountPage();
	}
	
	public void ImportAccounts() {
		
		
		
	}
	
	
}


