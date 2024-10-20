package com.OpenMRS.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {

	

	
	public WebDriver driver;
	

		public static void  sendKeys(WebElement element, String input) {
			try {
				element.sendKeys(input);
				
				
			} catch (Exception e) {
				e.printStackTrace();		
				}
			
		}
 
public class getattribute {
	
	
	protected void launchBrowser(String string) {
	System.out.println("hai");
		
	}

	
	public String getAttribute(WebElement element) {
		return element.getAttribute("class");
	}



}
protected static void validation(String actual,String expected) {
	try {
		Assert.assertEquals(actual, expected);
		
	} catch (Exception e) {
		Assert.fail("ERROR : OCCUR DURING VALIDATION ");
		
	}
}
}
