package tdd.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {
	
	LeapYear lp=new LeapYear();
	@Test
	public void isYearDivisiblebyFour()
	{
		assertTrue(lp.isLeapYear(2000));
		assertFalse(lp.isLeapYear(1999));
	}

	@Test
	public void isYearDivisibleby4andNotby100()
	{
		assertFalse(lp.isLeapYear(2200));
	}

}
