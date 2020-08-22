package com.test;

import org.testng.annotations.Test;

public class RunMultipleTestCasesfromXml {
	
	@Test()
    public void testMethod1() {
        System.out.println("Running @Test - testMethod1");
    }

    @Test()
    public void testMethod2() {
        System.out.println("Running @Test - testMethod2");
    }

    @Test()
    public void testMethod3() {
        System.out.println("Running @Test - testMethod3");
    }

    @Test()
    public void testMethod4() {
        System.out.println("Running @Test - testMethod4");
    }
}


