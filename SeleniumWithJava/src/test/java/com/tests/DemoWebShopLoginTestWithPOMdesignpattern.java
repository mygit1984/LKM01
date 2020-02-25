package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class DemoWebShopLoginTestWithPOMdesignpattern {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeTest
	public void beforeTest() {
		driver=DriverUtility.getDriver("chrome");
		//LoginPage loginPage=new LoginPage();
		loginPage=PageFactory.initElements(driver, LoginPage.class);
		homePage=PageFactory.initElements(driver, HomePage.class);
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}
	
	@Test(priority=1)
	public void test1() {
		String s1=homePage.clickLogin();
		Assert.assertTrue(s1.contains("Login"));
	}
	
	@Test(priority=2)
	public void test2() {
		boolean flag=loginPage.clickLogin();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void afterTest() {
		loginPage=null;
		homePage=null;
		driver.close();
	}

}
