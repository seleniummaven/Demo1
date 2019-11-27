package seleniumpractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	
	SoftAssert softassert = new SoftAssert();
	@Test(priority=1)
	public void firsttest()
	{
		System.out.println("im in a firsttest");
		System.out.println("before first assert");
		Assert.assertEquals("abc", "abc");
		System.out.println("after first assert");
		System.out.println("before second assert");
		Assert.assertTrue(3>2, "verifying element");
		System.out.println("after secont assert");
	}
	
	@Test(priority=2,dependsOnMethods= {"firsttest"},groups= {"sanity"})
	public void secondtest()
	{
		System.out.println("im in a secondtest");
		System.out.println("before third assert");
		softassert.assertEquals("abc", "abc1");
		System.out.println("after third assert");
		System.out.println("before forth assert");
		softassert.assertTrue(3>2, "verifying element");
		System.out.println("after forth assert");
		softassert.assertAll();
	}

}
