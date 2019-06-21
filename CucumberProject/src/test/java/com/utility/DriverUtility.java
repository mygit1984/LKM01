package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	
	//Your test code calls this method by passing the browser name
	//this method returns driver instance to the test method
	//Input:broswer name(chrome/ie/firefox)
	//Output:Browser instance
	
	public static WebDriver getDriver(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\MyDriver\\chromedriver.exe");
			return new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\MyDriver\\geckodriver.exe");
			return new FirefoxDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\MyDriver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}else {
			return null;
		}
		
	}

}
