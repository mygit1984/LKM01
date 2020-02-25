package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDynamicDropDownBox {
	
	@Test
	public void testDropDown() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mahindraxuv300.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Find a dealer")).click();
		driver.findElement(By.className("findDealerLink")).click();
		driver.findElement(By.id("select-state-rightPanel")).sendKeys("TAMIL NADU");
		//driver.findElement(By.id("select-city-rightPanel")).sendKeys("chennai");
		WebElement city=driver.findElement(By.id("select-city-rightPanel"));
		Select sel=new Select(city);
		//driver.
		List<WebElement> cityList=sel.getOptions();
		System.out.println("value"+ cityList.size());
		Assert.assertEquals(cityList.size(), 30);
		for(WebElement e:cityList) {
			System.out.println(e.getText());
			System.out.println(e.getTagName());
			//System.out.println(e.getAttribute(name));
		}
		
	}

}
