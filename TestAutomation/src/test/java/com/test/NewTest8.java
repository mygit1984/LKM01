package com.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.driver.DriverUtility;

public class NewTest8 {
	//ExtentHtmlReporter reporter;
	ExtentSparkReporter reporter;
	ExtentReports reports;
	ExtentTest logger;
	WebDriver driver;

	@BeforeTest
	public void startTest() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms");
		String path=System.getProperty("user.dir")+"/extent-reports/"+
		sdf.format(new Date())+".html";
		
		//reporter=new ExtentHtmlReporter(path);
		reporter=new ExtentSparkReporter(path);
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("hostname", "local host");
		reports.setSystemInfo("Environment", "Testing environment");
		reports.setSystemInfo("Username", "Kannan.Ramalingam");
		
		reporter.config().setDocumentTitle("The title of the document");
		reporter.config().setReportName("Demo Web Shop Report");
		reporter.config().setTheme(Theme.DARK);
		
		
	}
	
	@AfterTest
	public void endTest() {
		reports.flush();
	}
	
	@AfterMethod
	public void captureStatus(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, result.getMethod().getMethodName()+" test is passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			String imagePath=System.getProperty("user.dir")+"/extent-reports/capture/"+
					result.getMethod().getMethodName()+".png";
			logger.log(Status.FAIL, result.getMethod().getMethodName()+" test is failed");
			//driver--->TakesScreenshot
			//double--->float
			TakesScreenshot capture=(TakesScreenshot) driver;
			File file=capture.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File(imagePath));
				logger.addScreenCaptureFromPath(imagePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	@Test(priority = 1)
	public void login() {
		logger=reports.createTest("Login Test");
		Assert.assertTrue(true);
	}	
	
	@Test(priority = 2)
	public void demowebshop() {
		logger=reports.createTest("Logout Test");
		driver=DriverUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("kim@gmail.com");
		driver.findElement(By.id("Pass")).sendKeys("test123");
		//mdfdkfjdkjfdfkjdfdjfdkfdjf
		//f,dfkdlfkdlfkdlfkdlfdlfkdlfkdlf
		//dfdlfdlfdlfdlfdf
		
	}
}
