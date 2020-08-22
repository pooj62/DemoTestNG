package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ParamTestWithDataProvider1 {
	
	WebDriver driver;
	
	public void startApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://auth.testproject.io/auth/realms/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("/auth/realms"));
	}

	  
}
