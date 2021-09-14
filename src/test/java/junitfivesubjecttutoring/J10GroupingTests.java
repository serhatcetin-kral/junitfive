/**
 * 
 */
package junitfivesubjecttutoring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class J10GroupingTests {

	
	// test multiblyExact() method by none-zero integer and test multiblyExact() method by zero integer
	
	
	@ParameterizedTest
	@CsvSource(value= {"-12,4,-3","-12,4,-3","12,4,3","12,-3,-4"})
	void multiblyTestWithNonZero(int rs,int x,int y) {
		
		assertEquals(rs,Math.multiplyExact(x,y));
		
	}
	
	@Nested
	class operationWithZero {
		
		@ParameterizedTest
		@CsvSource(value= {"0,4,0","0,-4,0","0,0,0","0,0,-3","0,0,4"})
		void multiblyTestWithZero(int rs,int x,int y) {
			
			assertEquals(rs,Math.multiplyExact(x,y));
			
		}	
		
		
		@ParameterizedTest
		@CsvSource(value= {"-4,-4,0","4,4,0","0,0,0","-3,0,-3","4,0,4"})
		void addTestWithZero(int rs,int x,int y) {
			
			assertEquals(rs,Math.addExact(x,y));
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
