package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoByTagName {
	@Test
	public void testDemoWebShop() {
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement e1=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]"));
		List<WebElement> we=e1.findElements(By.tagName("li"));
		System.out.println(we.size());
		
		for(WebElement e:we) {
			System.out.println(e.getText());
		}
		
	}

}
