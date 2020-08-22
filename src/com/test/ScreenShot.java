package com.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScreenShot {
	
	@Test
	public void capturScreenshot() {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91953\\Desktop\\Selenium1\\IEDriverServer.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("[@id='email']")).sendKeys("pooja chaushary");
		
		//TakesScreenshot ts= TakesScreenshot.captureScreenShot(driver);

        //((Object) ts).captureScreenShot(driver);

	}

}
