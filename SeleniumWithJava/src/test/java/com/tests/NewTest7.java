package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dp.DemoShopLoginDP;



public class NewTest7 {
	WebDriver driver;
  	
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String v1) {
	  driver=DriverUtility.getDriver(v1);
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/");
	  
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  @Test(dataProvider="dp1")
  public void testLogin(String userName,String password) {
	  	driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys(userName);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String text=driver.findElement(By.className("account")).getText();
		
		if(text.equals(userName)) {
			Assert.assertTrue(true);
			driver.findElement(By.linkText("Log out")).click();
		}else {
			Assert.assertTrue(false);
		}
  }
  
  @DataProvider(name="dp1")
  public Object[][] getData() {
	  Object[][] obj= {
			  				{"kannan1@gmail.com","test1234"},
			  				{"test123@gmail.com","pass1234"},
			  				{"kannan2@gmail.com","test1234"}
			  			
	  					};
	  return obj;
  }
}
