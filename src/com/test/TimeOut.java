package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut {
	
	 @Test
	    public void timeTestOne() throws InterruptedException {
	        Thread.sleep(1000);
	        System.out.println("Time test method one");
	    }
	 
	    @Test
	    public void timeTestTwo() throws InterruptedException {
	        Thread.sleep(400);
	        System.out.println("Time test method two");
	    }
	    
	    @Test
	    public void timeTestThree() throws InterruptedException {
	    	Thread.sleep(3000);
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.functionize.com/");
			String s =driver.getTitle();
			driver.manage().window().maximize();		
			driver.quit();
		}
	    	
	    @Test(timeOut=1000)
	    public void timeTestFour()  {
	    	
	        try {
	            Thread.sleep(1000);
	        } catch(InterruptedException e) {
	            System.out.println("FAIL");
	            e.printStackTrace();
	        }
	        System.out.println("SUCCESS");

	    
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.functionize.com/");
			String s =driver.getTitle();
			driver.manage().window().maximize();		
			driver.quit();
		}
	    	
	    }
	
	
