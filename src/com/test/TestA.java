package com.test;

import org.testng.annotations.Test;

public class TestA {
	
	@Test(priority=1)
	public void DoLogin() {
		System.out.println("Do login test");
	}
	
	@Test(priority=2)
	public void DoPassword() {
		System.out.println("Do password test");
	}
	
	@Test(priority=3)
	public void DoLogout() {
		System.out.println("Do logout test");
	}
	
	@Test (priority=4)
	public void DoChangePassword() {
		System.out.println("Do ChangePassword test");
	}
	
	

}
