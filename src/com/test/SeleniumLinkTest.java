package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumLinkTest {
	
	public WebDriver driver;
	String baseUrl = "https://www.google.co.in";
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void seleniumElements() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("_fZl")).click();
		
		Thread.sleep(3000);
		
		
		
	
		
	}
}
