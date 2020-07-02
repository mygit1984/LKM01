package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoWebShopLoginTest {
	WebDriver driver;
	@Parameters("node")
	@BeforeTest
	public void beforeTest(String url) throws MalformedURLException {
		DesiredCapabilities ds=DesiredCapabilities.chrome();
		ds.setPlatform(Platform.ANY);
		driver=new RemoteWebDriver(new URL(url),ds);
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
	
	@Test(dataProvider="dp1")
	public void testLogin(String userName,String password) {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String email=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		if(email.equals(userName)) {
			driver.findElement(By.linkText("Log out")).click();
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	@DataProvider(name="dp1")
	public Object[][]  getData() {
		Object[][] obj= {	
							{"kannan1@gmail.com","test1234"},
							{"askme@gmail.com","pass1233"},
							{"kannan2@gmail.com","test1234"}
						};
		return obj;
	}

}
