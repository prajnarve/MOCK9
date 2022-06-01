package ComSaucePOMClassesFinal;

import org.testng.annotations.Test;

public class PracticeClass3 
{
	@Test(priority=2, invocationCount=5)
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=1, invocationCount =2)
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test                //by default 1
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test (invocationCount=-1)         
	public void testD()
	{
		System.out.println("Test D");
	}

	@Test(invocationCount=2)       //will not be executed
	public void testE()
	{
		System.out.println("Test E");
	}

}
