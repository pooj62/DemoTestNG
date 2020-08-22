package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*
	 * Setup System property for chrome
Launch Browser
Login to app
Enter URL
Google Title Test
Logout from app
CloseBrowser
DeleteAllCookies
PASSED: googleTitleTest

	 */
	 
	
	//precondition--- starting with @Before
	
	/* Output
	 * @BeforeSuite...Setup System property for chrome---1|
@BeforeTest...Launch Browser----2                         |-----This is a preference for every testcase
@BeforeClass...Login to app----3                          |


@BeforeMethod...Enter URL
@Test...searchTest
@AfterMethod...googleLogoTest


@BeforeMethod...Enter URL
@Test...Google Title Test
@AfterMethod...googleLogoTest


@BeforeMethod...Enter URL
searchTest
@AfterMethod...googleLogoTest


@AfterClass...CloseBrowser
@AfterTest...DeleteAllCookies
PASSED: googleLogoTest
PASSED: googleTitleTest
PASSED: searchTest
	 */
	
	
	@BeforeSuite//1
	public void setUp() {
		System.out.println("@BeforeSuite...Setup System property for chrome");
	}
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("@BeforeTest...Launch Browser");
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("@BeforeClass...Login to app");
	}
	
	/*@BeforeMethod
	 * @Tes1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test2
	 * @AfterMethod
	 * 
	 * @beforeMethod
	 * @Test4
	 * @AfterMethod
	 */
	
	@BeforeMethod//4
	public void enterUrl() {
		System.out.println("@BeforeMethod...Enter URL");
	}
	
	//Test Case---Starting with @Test
	@Test//5
	public void googleTitleTest() {
		System.out.println("@Test...Google Title Test");
	}
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	@Test
	public void googleLogoTest() {
		System.out.println("@Test...searchTest");
	}
	
	
	//Post Condition---Starting with @After						
	@AfterMethod//6
	public void logout() {
		System.out.println("@AfterMethod...googleLogoTest");
	}																			
	
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("@AfterClass...CloseBrowser");
	}
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("@AfterTest...DeleteAllCookies");
	}
	
}
