package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test(priority=1)
	public void homeTest() {
	System.out.println("im in homeTest");	
	System.out.println("before assert");
	Assert.assertTrue(4>3, "verifying element");
	System.out.println("aftr assert");
	Assert.assertEquals("abc", "abc");
	
}
	@Test(priority=2, dependsOnMethods = "homeTest" , groups = {"sanity","smoke"})
	
	public void mainTest() {
	System.out.println("im mainTest");
	System.out.println("before assert");
	softAssert.assertEquals(4>3, "verifying element");
	System.out.println("aftr assert");
	softAssert.assertAll();
	
	
}
	@Test(priority=3,dependsOnMethods = "mainTest")
	
	public void endTest() {
	System.out.println("im in endTest");
	System.out.println("before assert");
	Assert.assertTrue(4>3, "verifying element");
	System.out.println("aftr assert");
	softAssert.assertEquals("abc", "abc1");
	System.out.println("after second assert");
	softAssert.assertAll();
	
}

}
