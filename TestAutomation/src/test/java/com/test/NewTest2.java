package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	
	@Test
	public void testDemoWebShop() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");//validation
		driver.findElement(By.id("Email")).sendKeys("kannan1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("test1234");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String email=driver.findElement(By.className("account")).getText();
		Assert.assertEquals(email, "kannan1@gmail.com");//validation
		
	}

}
