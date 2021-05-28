package com.w2a.pagess;

import org.openqa.selenium.By;


import com.w2a.base.page;



public class HomePage extends page{


	
	
	public LoginPage goToLogin() {
		
		
      //driver.findElement(By.className("zh-login")).click();
		click("loginlink_CSS");
      return new LoginPage();
	}
}
