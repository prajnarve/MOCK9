package ComSaucePOMClassesFinal;

import org.testng.annotations.Test;

public class PracticeClass2 
{
	@Test(priority=-2)
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test(priority=-1)
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test
	public void testD()
	{
		System.out.println("Test D");
	}

	@Test(priority=0)
	public void testE()
	{
		System.out.println("Test E");
	}

}
