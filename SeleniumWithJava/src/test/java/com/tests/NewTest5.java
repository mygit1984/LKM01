package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest5 {
  WebDriver driver;
  @BeforeMethod	
  public void beforeMethod() {
	  System.out.println("before method");
	  driver=DriverUtility.getDriver("chrome");
	  driver.manage().window().maximize();
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  driver.close();
  }
  
  @Test
  public void testGoogle() {
	  driver.get("https://www.google.com/");
	  System.out.println("selenium code for testing google func.");
	  
  }
  
  @Test
  public void testFaceBook() {
	  driver.get("https://www.facebook.com/");
	  System.out.println("selenium code for testing facebook func.");
  }
  
}
