package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount =5)
	public void getTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.functionize.com/");
		String s =driver.getTitle();
		driver.manage().window().maximize();		
		driver.quit();
	}

}
