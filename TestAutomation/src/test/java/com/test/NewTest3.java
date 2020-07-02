package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.LoginPage;

public class NewTest3 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test(priority = 1)
	public void clickLoginLink() {
		HomePage.login.click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
	}
	
	@Test(priority = 2)
	public void login() {
		LoginPage.email.sendKeys("kannan1@gmail.com");
		LoginPage.password.sendKeys("test1234");
		LoginPage.loginButton.click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
