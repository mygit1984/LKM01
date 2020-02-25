package com.tests;

import org.testng.annotations.Test;

public class NewTest2 {
	//Registration
	//Login
	
	@Test(priority=1)
	public void testRegistration() {
		System.out.println("Registration");
	}
	
	@Test(priority=2)
	public void testLogin() {
		System.out.println("Login");
		
	}
	
}
