package com.example.maven_github_demo_094;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradeCalcitest {
	@Test
	void testTotal()
	{
		assertEquals(225,GradeCalci.calculateTotal(75,68,82));
		}
	@Test
	void testAverage()
	{
		assertEquals(75.0,GradeCalci.calculateAverage(75,68,82));
		}
	@Test
	void testPass()
	{
		assertTrue(GradeCalci.isPass(75.0));
	 
		}
	@Test
	void testFail()
	{
		assertFalse(GradeCalci.isPass(35.0));
		}


}
