package seleniumpractice;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Test3 {
	
	@Rule
	public ErrorCollector errcol = new ErrorCollector();
	
	@Test
	public void Test6()
	{
		System.out.println("checking assert");
		String expected="abc";
		String actual="abc";
		Assert.assertEquals(expected, actual);
		System.out.println("after assert 1st assert");
		Assert.assertTrue("verifying conditin 2>1", 2>1);
		System.out.println("after 2nd assert");		
		
	}
	
	@Test
	public void Test7()
	{
		System.out.println("checking assert");
		String expected="abc";
		String actual="abc1";
		try
		{
		Assert.assertEquals(expected, actual);
		}
		catch (Throwable t) {
			System.out.println("after assert 1st assert");
			errcol.addError(t);
		}
		
		Assert.assertTrue("verifying conditin 2>1", 2<4);
		System.out.println("after 2nd assert");		
		
	}

}
