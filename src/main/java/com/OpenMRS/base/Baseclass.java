package com.OpenMRS.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {
	public WebDriver driver;
	
	public String getAttribute(WebElement element) {
		return element.getAttribute("class");
	}

}
