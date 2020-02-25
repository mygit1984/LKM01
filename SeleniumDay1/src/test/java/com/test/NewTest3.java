package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest3 {
	@Test
	public void testGoogle() {
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromdriver.exe");
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText(""")).click();
		
	}
		
}
