package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J04BeforeAll_AfterAll {

	@BeforeAll
	static void beforeAll(TestInfo info) {//if you use info with beforeall or afterall use static void
		System.out.println("before all executed");
		
	}
	
	@AfterAll
	static void afterAll(TestInfo info) {
		System.out.println("after all executed");
		
	}
	
	
	
	
	
	
	@Test
	void  testArrays(TestInfo info) {
	
	String str="junit5 is better than junit4";
		String actualArr[]=str.split(" ");
	   String[] expectedArr= {"junit5","is","better","than","junit4"};
	     
	 
	  assertArrayEquals(actualArr, expectedArr,"ARRAYS NOT EGQUAL"); 
	   System.out.println(info.getDisplayName()+" is execute");
	   
	   
          
         
	}
	
	@Test
	void testStringLength(TestInfo info) {
		String str="junit5 is better than junit4";
		int actualLength=str.length();
		int expectedLength=28;
		assertEquals(expectedLength,actualLength,"length is not equal");
		
		System.out.println(info.getDisplayName()+" is executed");
	}

}
