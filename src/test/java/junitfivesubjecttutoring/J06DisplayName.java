package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class J06DisplayName {

	
	@Test
	@DisplayName("this method check for null pointer exception")
	void testException() {
		
	String str="ALI CAN";
	
	assertThrows(NumberFormatException.class,
			
			()->{
				Integer.parseInt(str);
			}
			
			
			);

	}
	
}
