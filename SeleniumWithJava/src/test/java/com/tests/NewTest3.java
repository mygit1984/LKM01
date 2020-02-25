package com.tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NewTest3 {
	
	@Test
	public void testNewTourLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"Find a Flight: Mercury Tours:");
		//driver.findElement(By.name("tripType")).click();
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		WebElement city=driver.findElement(By.name("fromPort"));
		Select sel=new Select(city);
		List<WebElement> cityList=sel.getOptions();
		System.out.println("total number of cities:"+cityList.size());
		
		for(WebElement e:cityList) {
			//System.out.println(e.getText());
			String addr=e.getText();
			if(addr.equals("Paris")) {
				sel.selectByVisibleText(addr);
				break;
			}
		}
		
		
	}

}
