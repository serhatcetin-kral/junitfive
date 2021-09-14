package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {
/*
 * junit we do not type access mpdifier but it is not default
 * it is public or protected
 * for junit5
 * but junit 4 we put public
 */
	@Test
	void testToFail() {
		//fail("Not yet implemented serhat");
	}

	@Test
	void testlenght() {
		
		int actualLength="ABCD".length();
		
		int expectedLength=4;
		//we need to compare "actual" and expected values ==>assertion
		
		//1.assertEguals
		//a)ASSERTequals with 2 parameters
	//	assertEquals(expectedLength,actualLength);
		//b)assertEquals with 3 parameters
		//assertEquals(expectedLength, actualLength, "they are not matching unfotuanalitly");
		
		
		//2)assertTrue()
		//a)
		//assertTrue(expectedLength==actualLength);
		//b)
		//assertTrue(expectedLength==actualLength, "actual length is not mattching with expected one");

		//3.
		//a)ssertFalse
		//assertFalse(expectedLength==actualLength);
		//b) 
		//assertFalse(expectedLength==actualLength, "the length should not be same");	
	}
	
	@Test
	void testContainsMethod(){
		
		//boolean actualResult="ALICAN".contains("jk")
		// boolean expectedResult=false;
		
		//if you want just copy the in the asserteguals 
		assertEquals(false, "ALICAN".contains("jk"));
		
		
		
		
	}
}
