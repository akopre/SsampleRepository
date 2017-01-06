import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactTest {

	Maths m;
	@Before
	public void setUp() throws Exception {
		m=new Maths();
	}

	/*
	 * 1.when the number is zero system should return one
	   2.when the number is one system should return one
	   3.when the number is positive system should return expected output
	   4.when the number is negative system should throw exception

	 */
	
	@Test
	public void whenTheNumberIsZeroSystemShouldReturnOne()
	{
		assertEquals(1, m.getFactorial(0));
	}
	
	@Test(expected=java.lang.IllegalArgumentException.class)
	public void whenTheNumberIsNegativeSystemShouldThrowException()
	{
		m.getFactorial(-4);
	}

	@Test
	public void whenTheNumberIsPositiveSystemShouldReturnOne()
	{
		assertEquals(120, m.getFactorial(5));
	}
	
	public boolean checkNumber(int x)
	{
		if(x > 0 )
		{
			return true;
		}
		
		return false;
	}
	
	@Test
	public void checkPostive()
	{
		assertTrue(checkNumber(4));
	}
	
	@Test
	public void checkNegative()
	{
		//System.out.println(checkNumber(4));
		assertFalse(checkNumber(-4));
	}
}
