package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
	
	@Test
	public void openFirefox() {
		System.setProperty("webdriver.gecko.driver", "src//test//resources//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	}

}
