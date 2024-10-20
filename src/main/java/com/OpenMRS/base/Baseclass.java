package com.OpenMRS.base;

public class Baseclass {
	protected static void validation(String actual,String expected) {
		try {
			Assert.assertEquals(actual, expected);
			
		} catch (Exception e) {
			Assert.fail("ERROR : OCCUR DURING VALIDATION ");
			
		}
	}

}
