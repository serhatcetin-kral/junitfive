package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class J07ParameterizedTest {

	
	/*
	 * create a test method for the length method if the length 
	 * work as expected
	 * for "ABCD","ABC","A","","abcdefg"
	 */
	
	@Test
	void testLength() {
	assertTrue("ABCD".length()>0);
	assertTrue("ABC".length()>0);
	assertTrue("A".length()>0);
	assertTrue("".length()>0);
	assertTrue("abcdefg".length()>0);
	
	}
	
	@ParameterizedTest
	@ValueSource(strings={"ABCD","ABC","A","","abcdefg"})
	void testLength2(String str) {
		
		assertTrue(str.length()>0);
		
	}
	
	@Test
	void toUpperCaseTest1() {
		String str1="Ali Can";
		String str2="ali can";
		String str3="ali";
		String str4="123";
		String str5="A";
		String str6="";
		assertEquals("ALI CAN",str1.toUpperCase());
		assertEquals("ALI CAN",str2.toUpperCase());
		assertEquals("ALI",str3.toUpperCase());
		assertEquals("123",str4.toUpperCase());
		assertEquals("A",str5.toUpperCase());
		assertEquals("",str6.toUpperCase());// this part you can pass
	}
	
	@ParameterizedTest
	@CsvSource(value= {"ALI CAN,Ali Can","ALI CAN,ali can","ALI,ali","123,123","A,A"," \"\",\"\"  "})
	void toUpperCaseTest2(String s1,String s2) {
	
		assertEquals(s1,s2.toUpperCase());
		
	}
	
	//check if a string contain "a" or not
	//use "ali" and "can" "sam" and "joe" -"tom" and "sam"-"tom" and "joe"
	
	
	
	@ParameterizedTest     //triple parameter
	@CsvSource(value= {"true,ali,a","false,joe,a","false,tom,a"})
	void toUpperCaseTest3(boolean b1,String s1,String s2) {
		
		assertEquals(b1,s1.contains(s2));
		
		
		
		
	}
	
	
	
	
}
