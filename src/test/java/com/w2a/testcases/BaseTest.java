package com.w2a.testcases;

import org.testng.annotations.AfterSuite;

import com.w2a.base.page;

public class BaseTest {

	@AfterSuite
	public void tearDown() {
		
		page.quit();
		
	}
}
