package com.generic;

import java.util.concurrent.TimeUnit;

public class WrapperFunctions {
		
		public WrapperFunctions() {
			
		}

		public void waitFor(int timeUnitinsecond)
		{
			try {
				Thread.sleep(TimeUnit.MILLISECONDS.convert(timeUnitinsecond,TimeUnit.SECONDS));
				
			} catch (Exception exception) {
				System.out.println("Error Message " +exception.getMessage());
			}
			
		}
		
		/*public void verifyFieldsOnSignUpPage(DataTable dataTable, String strTagName) {
			List<Map<String, String>> listFields = dataTable.asMaps(String.class, String.class);
			for (int intIndex = 0; intIndex < listFields.size(); intIndex++) {
				String strData = listFields.get(intIndex).get("Fields");
				WebElement webElement = Pojo.getDriver().findElement(By.xpath("//"+strTagName+"[@name='" + strData + "']"));
				Pojo.getObjWrapperFunctions().waitFor(2);
				if (!strData.equals(""))
					Assert.assertTrue(webElement.isDisplayed());
				System.out.println("Verified fields " + strData + " on signup page.");
			}
		}
		
		// random string generation
			public String getRandomStrings(int length) {
				String strValue = "QWERTYUIOPASDFGHJKLZXCVBNM";

				String randomString = "";
				for (int index = 0; index < length; index++) {
					int rnum = (int) Math.floor((Math.random() * strValue.length()));
					randomString += strValue.substring(rnum, rnum + 1);
				}
				return randomString;
			}
		*/
	


}
