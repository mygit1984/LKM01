package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoForDynamicDropDownBox {
	
	@Test
	public void testXUV300() {
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.mahindraxuv300.com");
		driver.findElement(By.className("findDealerLink")).click();
		driver.findElement(By.id("select-state-rightPanel")).sendKeys("TAMIL NADU");
		WebElement city=driver.findElement(By.id("select-city-rightPanel"));
		Select sel=new Select(city);
		List<WebElement> cityList=sel.getOptions();
		
	}

}
