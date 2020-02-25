package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShopTest {
  WebDriver driver;
  String emailId="myabc8883@gmail.com";
  String password="test1234";
  
  @BeforeTest	
  public void BeforeTest() {
	  driver=DriverUtility.getDriver("firefox");
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  @Test(priority=1)
  public void testRegistration() {
	  	driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Kannan");
		driver.findElement(By.name("LastName")).sendKeys("Ramalingam");
		driver.findElement(By.name("Email")).sendKeys(emailId);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		String text=driver.findElement(By.className("account")).getText();
		//System.out.println(text);
		if(text.equals("emailId")) {
			Assert.assertTrue(true);
			driver.findElement(By.linkText("Log out")).click();
			driver.findElement(By.linkText("Log in")).click();
		}else {
			Assert.assertTrue(false);
		}
  }
  
  @Test(priority=2,dependsOnMethods="testRegistration")
  public void testLogin() {
	    System.out.println("login");
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String text=driver.findElement(By.className("account")).getText();
		if(text.equals(emailId)) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
  }
}
