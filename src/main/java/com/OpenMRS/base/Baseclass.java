package com.OpenMRS.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {
	
	public WebDriver driver;
	
	
	protected void launchBrowser(String string) {
	System.out.println("hai");
		
	}
	
	public String getAttribute(WebElement element) {
		return element.getAttribute("class");
	}

}
