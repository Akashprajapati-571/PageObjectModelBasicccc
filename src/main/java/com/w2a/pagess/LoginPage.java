package com.w2a.pagess;

import org.openqa.selenium.By;


import com.w2a.base.page;

public class LoginPage extends page {

	
		
		
		public ZohoAppPage doLogin(String username, String password) {
			
		/*driver.findElement(By.cssSelector("#login_id")).sendKeys(username);
		driver.findElement(By.cssSelector("#nextbtn")).click();
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#nextbtn > span")).click();*/
		
			type("email_CSS",username);
			click("nextbtn_CSS");
			type("password_CSS",password);
			click("nextbtn1_CSS");	
			
		return new ZohoAppPage();
			
		}
	
}
