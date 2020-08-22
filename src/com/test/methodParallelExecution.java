package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class methodParallelExecution {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in beforeMethod");
	}
	

	@Test
	public void testOne(){
	System.out.println("I am in testOne");
	}
	
	@Test
	public void testTwo(){
	System.out.println("I am in testTwo");
	}
	
	@AfterTest
	public void afterMethod(){
	System.out.println("I am in after Method");
	}

}
