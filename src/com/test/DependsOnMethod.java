package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	WebDriver driver;//global reference
	
	
	@Test
	public void startApp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("auth/login"));
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		boolean status = driver.findElement(By.id("menu_admin_viewAdminModule")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(dependsOnMethods="loginApp")
	public void logOutApp() {
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		Assert.assertTrue(driver.findElement(By.id("txtUsername")).isDisplayed());
		
		driver.quit();
		
		
	}
	

}
