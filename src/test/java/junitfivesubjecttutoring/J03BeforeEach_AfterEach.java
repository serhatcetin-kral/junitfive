package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J03BeforeEach_AfterEach {
String str; //we can use beforeEach for initiali
	
@BeforeEach   //beforeEach executed before all method in junit4 just @Before inJUNIT 5 @beforeEach
void beforeEach() {

	str="junit5 is better than junit4"; //for initiali
	System.out.println("beforeeach() is executed");
	
}
@AfterEach //afterEach executed after all method
void afterEach() {
	str=null; // weput for reset value 
	System.out.println("after each executed");
}
	
	@Test
	void  testArrays(TestInfo info) {
	
		//String str="junit5 is better than junit4";
		String actualArr[]=str.split(" ");
	   String[] expectedArr= {"junit5","is","better","than","junit4"};
	     
	 
	   
	   System.out.println(info.getDisplayName()+" is execute");
	   
	   
         assertTrue(Arrays.equals(actualArr, expectedArr));   
         
	}
	
	@Test
	void testStringLength(TestInfo info) {
		int actualLength=str.length();
		int expectedLength=28;
		assertEquals(expectedLength,actualLength,"length is not equal");
		
		System.out.println(info.getDisplayName()+" is executed");
	}
	
//	@Test
//	void testToFindMin() {
//	
//		System.out.println("findMin() method executed");
//		assertTrue(Math.min(12.3, 13.2)==12.3);
//		
//		assertFalse(Math.min(12.3, 13.2)!=12.3);
//		
//		assertEquals(12.3,Math.min(12.3, 13.2) );
//	
//		
//	}
	
	
}
