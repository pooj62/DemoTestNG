package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyMultiSelect {
	
	@Test
	public void testMultiSelect() throws InterruptedException {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='cars']"));
		Select sel = new Select(element);
		sel.deselectByIndex(0);
		sel.selectByValue("saab");
		sel.selectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		sel.deselectByIndex(0) ; 
		Thread.sleep(3000);
		
		List<WebElement> selectedcars = sel.getAllSelectedOptions();
		for(WebElement webElement : selectedcars) {
			System.out.println("Selected cars = " +webElement.getText());
		}
		
		List<WebElement> allcars = sel.getOptions();
		for(WebElement webElement : allcars) {
			System.out.println("Selected cars = " +webElement.getText());
		}
		

	}
}
