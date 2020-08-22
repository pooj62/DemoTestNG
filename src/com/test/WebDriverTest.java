package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebDriverTest extends SeleniumLinkTest{
	
	@Test(priority=1)
	public void linktext() {
		//image hyperlink
		driver.findElement(By.linkText("images")).click();
	}
	
	@Test(priority=2)
	public void clearKeyword() throws InterruptedException {
	Thread.sleep(3000);
	
	driver.findElement(By.name("q")).clear();
	System.out.println("Clear enter google search keywords from search box");

	

}
}
