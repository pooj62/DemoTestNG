package com.test;

import org.testng.annotations.Test;

public class ParallelMethodExe {
	
	@Test
	public void testOne(){
		for(int i=0 ; i<=10 ; i++) {
	System.out.println("testOne i values : "+i);
		}
	}
	
	@Test
	public void testTwo(){
		for(int i= 100 ; i<=110 ; i++)
	System.out.println("testTwo i values : "+i);
	}

}
