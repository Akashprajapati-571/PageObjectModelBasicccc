package com.w2a.rough;

import com.w2a.base.page;
import com.w2a.pages.crm.accounts.AccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountPage;
import com.w2a.pagess.HomePage;
import com.w2a.pagess.LoginPage;
import com.w2a.pagess.ZohoAppPage;

public class LoginTestt {

	public static void main(String[] args) {

		/*HomePage home = new HomePage();
		home.goToLogin();
		LoginPage login = new LoginPage();
		login.doLogin("automationengnr@gmail.com", "Akash@571");

		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		page.menu.gotoAccounts();

		AccountsPage account = new AccountsPage();
		account.CreateAccount();
		CreateAccountPage cap = new CreateAccountPage();
		cap.createAccount("Akash");*/
		
		HomePage home = new HomePage();
		LoginPage login=home.goToLogin();
		ZohoAppPage zp = login.doLogin("automationengnr@gmail.com", "Akash@571");
        
		zp.goToCRM();
		AccountsPage account = page.menu.gotoAccounts();
        CreateAccountPage cap =account.CreateAccount();
		cap.createAccount("Akash");
	}

}
