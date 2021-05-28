package com.w2a.pagess;

import org.openqa.selenium.By;


import com.w2a.base.page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends page {

	
	public CRMHomePage goToCRM() {
		
		driver.findElement(By.cssSelector("._logo-crm")).click();
		return new CRMHomePage();
	}
	
public void goToDesk() {
		
	driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/span")).click();
		
	}

public void goToConnect() {
	
	driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/span")).click();
	
}
	
	
}
