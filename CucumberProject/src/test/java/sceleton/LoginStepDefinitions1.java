package sceleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.LoginPage;
import com.utility.DriverUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinitions1 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("The URL of demo web shop")
	public void the_URL_of_demo_web_shop_application() {
	    driver=DriverUtility.getDriver("chrome");
	    PageFactory.initElements(driver, LoginPage.class);
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/login");
	    Assert.assertEquals("Demo Web Shop. Login", driver.getTitle());
	}

	@When("User enters {word} as (admin|guest|vendor) username")
	public void user_enters_as_username(String string) {
	    //driver.findElement(By.id("Email")).sendKeys(string);
		LoginPage.email.sendKeys(string);
	}

	@When("User enters {word} as password")
	public void user_enters_as_password(String string) {
		//driver.findElement(By.id("Password")).sendKeys(string);
		LoginPage.password.sendKeys(string);
	}

	@Then("User is in valid page")
	public void user_is_in_valid_page() {
	    //driver.findElement(By.cssSelector("input[value='Log in']")).click();
		LoginPage.login.click();
	    boolean flag=driver.findElement(By.linkText("Log out")).isDisplayed();
	    Assert.assertTrue(flag);
	    
	}

}
