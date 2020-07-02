package com.page;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//Page Class-----> Page object
public class HomePage {
	@FindBy(how=How.LINK_TEXT,using="Log in")
	public static WebElement login;
	@FindBy(how=How.LINK_TEXT,using="Register")
	public static WebElement register;

}
