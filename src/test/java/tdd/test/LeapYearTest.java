package tdd.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {
	
	LeapYear lp=new LeapYear();
	@Test
	public void isYearDivisiblebyFour()
	{
		assertTrue(lp.isLeapYear(2000));
	}


}
