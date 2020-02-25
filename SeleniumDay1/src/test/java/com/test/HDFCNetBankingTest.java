package com.test;

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
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		//Thread.sleep(5000);  //Java wait
		driver.switchTo().frame(1);
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("123");	
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		//driver.getWindowHandle();
		Set<String> w=driver.getWindowHandles();
		
		for(String addr:w) {
			driver.switchTo().window(addr);
		}
		
		//driver.switchTo().window();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
	}

}



//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //selenium wait
