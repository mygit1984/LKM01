package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTourLoginTestWithOutDesignPattern {
	
	@Test
	public void testLogin() {
		  WebDriver driver=DriverUtility.getDriver("firefox");
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.linkText("Log in")).click();
		  String s1=driver.getTitle();
		  Assert.assertTrue(s1.contains("Login"));
		  driver.findElement(By.id("Email")).sendKeys("kannan1@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("test1234");
		  driver.findElement(By.cssSelector("input[value='Log in']")).click();
		  String s2=driver.getTitle();
		  Assert.assertEquals(s2, "Demo Web Shop");
		
	}

}
