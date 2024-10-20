package com.OpenMRS.base;

import org.openqa.selenium.WebElement;

public class Baseclass {
	
        // sendkeys
		public static void  sendKeys(WebElement element, String input) {
			try {
				element.sendKeys(input);
				
				
			} catch (Exception e) {
				e.printStackTrace();		
				}
			
		}

}
