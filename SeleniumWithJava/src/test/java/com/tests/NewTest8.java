package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewTest8 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
 	public void beforeMethod(String v1) {
		driver=DriverUtility.getDriver(v1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);  //selenium wait
		driver.get("http://demowebshop.tricentis.com");
		
	}
	
	@AfterTest
	public void afterMethod() {
		driver.close();
	}
	
	@Test(dataProvider="dp1")
	public void testNewTourLogin(String userName,String password) throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys(userName);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		WebElement e1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		if(e1.getText().equals(userName)) {
			Assert.assertTrue(true);
			driver.findElement(By.linkText("Log out")).click();
		}else {
			Assert.assertTrue(false);
		}
		/*String title=driver.getTitle();
		Assert.assertEquals(title, "Demo Web Shop");
		if(title.equals("Demo Web Shop")) {
			driver.findElement(By.linkText("Log out")).click();
		}*/
	}
	
	@DataProvider(name="dp1")
	public Object[][] getData() {
		Object[][] obj= {	
							
							
							{"test@gmail.com","pass1234"},
							{"kannan2@gmail.com","test1234"},
							{"kannan1@gmail.com","test1234"}
							
						};
		return obj;
		
	}

}
