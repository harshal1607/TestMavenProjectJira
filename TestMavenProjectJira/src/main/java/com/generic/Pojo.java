package com.generic;

import org.openqa.selenium.WebDriver;

public class Pojo {

		private static WebDriver driver;
		private static WrapperFunctions objWrapperFunctions;
		
		public static WrapperFunctions getObjWrapperFunctions() {
			return objWrapperFunctions;
		}

		public static void setObjWrapperFunctions(WrapperFunctions objWrapperFunctions) {
			Pojo.objWrapperFunctions = objWrapperFunctions;
		}

		public static WebDriver getDriver() {
			return driver;
		}

		public static void setDriver(WebDriver driver) {
			Pojo.driver = driver;
		}


}
