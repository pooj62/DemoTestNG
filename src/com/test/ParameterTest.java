package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.commandhandler.ExceptionHandler;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	

	
	
	@Parameters(value={"env","browser","url","emailid"})
	@Test
	
	public void optionalyahooLogin(@Optional("Default parameter will execute if parameter tag is misses in testng.xml")String QA,String browser,String url,String emailid) {
		WebDriver driver;
		try {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath(" //input[@id='login-username']")).clear();
		driver.findElement(By.xpath(" //input[@id='login-username']")).sendKeys(emailid);
		driver.findElement(By.xpath(" //input[@id='login-signin']")).click();
		
		Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println(e);
		
		}
	}
}



