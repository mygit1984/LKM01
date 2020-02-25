package com.dp;

import org.testng.annotations.DataProvider;

public class DemoShopLoginDP {
	
	@DataProvider
	  public Object[][] getData() {
		  Object[][] obj= {
				  				{"kannan1@gmail.com","test1234"},
				  				{"test123@gmail.com","pass1234"},
				  				{"kannan2@gmail.com","test1234"}
				  			
		  					};
		  return obj;
	  }

}
