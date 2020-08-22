package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestB {

	@Test
	public void testB() {
		String expVal = "A";
		String actVal = "B";
		
		//Assert
		//Assert.assertEquals(actVal , expVal);
		
		Assert.assertTrue(14>13,"Some erroe message");
	}
		
		}

