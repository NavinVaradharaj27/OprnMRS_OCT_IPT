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
	
	
	public String getAttribute(WebElement element) {
		return element.getAttribute("class");
	}


}
}
