package com.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic1 {
	
	WebDriver driver;
    String url = "http://google.com";
    
    @BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
		@Test(priority=1,groups="Title")
		public void googleTitleTest() {
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		@Test(priority=3,groups="logo")
		public void googleLogoTest() {
			boolean b= driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		}
		
		@Test(priority=2,groups="Link Text")
		public void mailLinkText() {
			boolean b= driver.findElement(By.linkText("GMail")).isDisplayed();
			
		}
		
		@Test(priority=4,groups="Test")
		public void test1() {
			System.out.println("test1");
		}
		
		@Test(priority=5,groups="Test")
		public void test2() {
			System.out.println("test2");
		}
		
		
}
	

