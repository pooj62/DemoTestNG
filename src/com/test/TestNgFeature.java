package com.test;

import org.testng.annotations.Test;

public class TestNgFeature {

	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i= 4/2;
		}
	
	@Test(dependsOnMethods= {"LoginTest"})
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods= {"LoginTest"})
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	
	@Test(dependsOnMethods= {"LoginTest"})
	public void RegistrationPageTest() {
		System.out.println("Registration Page Test");
	}
	
}
