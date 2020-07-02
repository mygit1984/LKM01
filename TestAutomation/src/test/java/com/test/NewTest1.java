package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest1 {
	//registration
	//login
	//addcart
	//logout
	
	@Test(priority = 1)
	public void testRegistration() {
		System.out.println("Registration Testing");
	}
	
	@Test(priority = 2)
	public void testLogin() {
		System.out.println("Login Testing");
	}
	
	@Test(priority = 3)
	public void testAddCart() {
		System.out.println("Addcart testing");
	}
	
	@Test(priority = 4)
	public void testLogout() {
		System.out.println("Logout testing");
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		WebElement e1=driver.findElement(By.id("kk"));
		Select sel=new Select(e1);
		//sel.d
		//act.d
	}

}
