package com.java.PageFactory;

import com.generic.BaseTest;
import com.generic.Pojo;

public class TestJava {

	BaseTest objBaseTest;
	public TestJava() {
		objBaseTest = new BaseTest();
	}
			
		public void openURLforFB()
		{
			objBaseTest.initialiseEnvironment();
			//Pojo.getDriver().navigate().to("https://www.facebook.com/reg/");
			//("https://www.facebook.com/reg/");
			Pojo.getDriver().get("https://www.facebook.com/reg/");
			System.out.println("Facebook is opened.");
		}
	
}
