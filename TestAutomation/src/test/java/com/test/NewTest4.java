package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.driver.DriverUtility;

public class NewTest4 {
	
	@Test
	public void testMouseActions() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		WebDriver driver=DriverUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.partialLinkText("Computers"));
		act.moveToElement(e1).perform();
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.partialLinkText("Desktops"));
		act.moveToElement(e2).click().perform();
		Assert.assertTrue(driver.getTitle().contains("Desktops"));
	}

}
