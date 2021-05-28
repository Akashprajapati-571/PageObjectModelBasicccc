package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.pagess.HomePage;
import com.w2a.pagess.LoginPage;
import com.w2a.pagess.ZohoAppPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		
		HomePage home = new HomePage(); 
		LoginPage login=home.goToLogin();
		//ZohoAppPage zp = login.doLogin("automationengnr@gmail.com", "Akash@571");
		login.doLogin(data.get("username"), data.get("password")); //when we are adding data provider class in @test then add this data.get
	}
	
}
