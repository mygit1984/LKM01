package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.driver.DriverUtility;

public class NewTest6 {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver=DriverUtility.supplyDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	public String login(String userName,String password) {
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String email=driver.findElement(By.className("account")).getText();
		
		if(userName.equals(email)) {
			driver.findElement(By.linkText("Log out")).click();
			driver.findElement(By.linkText("Log in")).click();
			return "Valid User";
		}else {
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Password")).clear();
			return "Invalid User";
		}
	}
	
	@Test
	public void readExcel() {
		String path="src\\test\\resources\\Test Data.xlsx";
		File file=new File(path);//locating the file
		try {
			InputStream is=new FileInputStream(file);//creating input stream
			XSSFWorkbook workbook=new XSSFWorkbook(is);//locating the workbook
			XSSFSheet sheet1=workbook.getSheet("Sheet1");//locating the sheet
			for(int i=1;i<=sheet1.getLastRowNum();i++)
			{
				String userName=sheet1.getRow(i).getCell(0).getStringCellValue();
				String password=sheet1.getRow(i).getCell(1).getStringCellValue();
				String result=login(userName,password);
				sheet1.getRow(i).createCell(2).setCellValue(result);
			}		
			OutputStream os=new FileOutputStream(file);
			workbook.write(os);
			workbook.close();
			//System.out.println(sheet1.getLastRowNum());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
