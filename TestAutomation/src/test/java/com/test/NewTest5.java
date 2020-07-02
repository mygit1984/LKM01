package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.driver.DriverUtility;

public class NewTest5 {
	
  @Test
  public void testMouseActions() throws InterruptedException {
	  WebDriver driver=DriverUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		String url="https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx";
		driver.get(url);
		Thread.sleep(9000);
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
		WebElement target=driver.findElement(By.id("ctl00_ContentPlaceholder1_priceChecker"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(5000);
		String text=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
		System.out.println(text);
  }
}
