package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo {
	
	private WebDriver driver;
//	private WrapperFunctions objWrapperFunctions;    
	
	public WebDriver initialiseEnvironment(){
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.manage().window().maximize();
		Pojo.setDriver(driver);
	//	objWrapperFunctions = new WrapperFunctions();
	//	Pojo.setObjWrapperFunctions(objWrapperFunctions);
		return driver;
	    
	}
	
	public void tearDownEnvironment(){
		if(driver!=null)
		driver.close();
		System.out.println("test execution completed !!!");
	}

}
