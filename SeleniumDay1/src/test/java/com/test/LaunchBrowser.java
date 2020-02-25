package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}
	
	/*@Test
	public void openFireFox() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}
	
	@Test
	public void openIE() {
		System.setProperty("webdriver.ie.driver", "C:\\WebDriver\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
	}*/

}
