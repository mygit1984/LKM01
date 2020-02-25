package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	String userName="kannan10@gmail.com";
	String pass="test1234";
	WebDriver driver;
	@FindBy(how=How.ID,using="Email")
	WebElement email;
	@FindBy(how=How.ID,using="Password")
	WebElement password;
	@FindBy(how=How.CSS,using="input[value='Log in']")
	WebElement login;
	
	public boolean clickLogin() {
		email.sendKeys(userName);
		password.sendKeys(pass);
		login.click();
		String v1=driver.findElement(By.className("account")).getText();
		if(v1.equals(userName)) {
			return true;
		}else {
			return false;
		}
	}
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
}
