package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWhenClickOnButton {
	
	@Test
	public void popup() {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Samsung Galaxy S10 Lite (Prism Black, 512 GB)')]"));
	    
	

		
	}

}
