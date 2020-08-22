package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerificationInTestng {
	
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
    @Test
    public void verifyTheTitle() {
    	String title =driver.getTitle();
    	System.out.println(title);
    	
    	//Assert.assertEquals(title, "Google","Title is match");//pass
    	Assert.assertEquals(title, "Google123","Title is not match");//fail
    	 }
    
    @Test()
	public void googleLogoTest() {
		boolean b= driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
    

}
