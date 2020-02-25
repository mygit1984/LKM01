package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	
	@Test(priority=1)
	public void testReistration() {
		System.out.println("Testting Registration");
	}
	
	@Test(priority=2)
	public void testLogin() {
		System.out.println("Testting Login");
	}
	
	@Test(priority=3)
	public void testLogout() {
		System.out.println("Testting Logout");
	}

}
