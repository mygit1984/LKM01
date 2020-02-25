package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest4 {
	
	@Test
	public void testDemoShop() {
		//System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		//WebElement we=driver.findElement(By.className("column my-account"));
		WebElement we=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul"));
		List<WebElement> list=we.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
	}

}
