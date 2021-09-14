package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToFindMin() {
	//refactor inline i used so no data
		assertTrue(Math.min(12.3, 13.2)==12.3);
		
		assertFalse(Math.min(12.3, 13.2)!=12.3);
		
		assertEquals(12.3,Math.min(12.3, 13.2) );
	
		
	}

	@Test
	void  testArrays() {
	
		String str="junit5 is better than junit4";
		String actualArr[]=str.split(" ");
	   String[] expectedArr= {"junit5","is","better","than","junit4"};
	     
         assertTrue(Arrays.equals(actualArr, expectedArr));  
	   
	}
}
