package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void testNewTourLogin() throws InterruptedException {
		
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//Thread.sleep(5000);
		driver.wait(5);
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Find a Flight Mer");
		
		//driver.findElement(By.name("tripType")).click();
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		
		
		
		
		
		
		
		//String title=driver.getTitle();
		
		Assert.assertEquals(title, "Demo Web Shop. Register");
			
		Assert.assertTrue(title.contains("Register"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
