package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest4 {
  WebDriver driver;	
  @BeforeTest
  public void beforeTest() {
	  driver=DriverUtility.getDriver("chrome");
	  driver.manage().window().maximize();
	  System.out.println("before Test");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("after test");
  }
  
  @Test(priority=1)
  public void testRegistration() {
	  System.out.println("Registration");
  }
  
  @Test(priority=2)
  public void testLogin() {
	  System.out.println("Login");
  }
  
  @Test(priority=3)
  public void testLogout() {
	  System.out.println("Logout");
  }
}
