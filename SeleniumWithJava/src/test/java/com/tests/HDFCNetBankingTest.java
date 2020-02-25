package com.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HDFCNetBankingTest {
	@Test
	public void hdfcNetBanking() throws InterruptedException {
		WebDriver driver=DriverUtility.getDriver("chrome");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //selenium wait
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");
		//driver.findElement(By.linkText("Continue to NetBanking")).click();
		//driver.findElement(By.className("btn btn-default redBtn")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		//driver.findElement(By.cssSelector("a.btn")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame("login_page");
		
		//WebElement f=driver.findElement(By.name("login_page"));
		//driver.switchTo().frame(f);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		//System.out.println(driver.getWindowHandle());
		Set<String> addr=driver.getWindowHandles();
		
		for(String a:addr) {
			//System.out.println(a);
			driver.switchTo().window(a);
		}
		
		//driver.switchTo().window();
		
		driver.findElement(By.linkText("Personal")).click();
		
		for(String a:addr) {
			//System.out.println(a);
			driver.switchTo().window(a);
			break;
		}
		
		driver.close();
		//driver.quit();
		
		/*Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();*/
		
		
		
		
		
		
	}

}
