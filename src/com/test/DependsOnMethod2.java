package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod2 {
	
	WebDriver driver;
	
	@Test
	public void startApp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://gaana.com/");
		}
	@Test(dependsOnMethods="startApp")
	public void signIn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='login open-popup desktop']")).click();
		
		
	}
	
}
