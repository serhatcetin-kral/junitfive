package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class J05TestingException {


	@Test
	void testException() {
		String str=null;
		//str.length(); null pointer exception
		
		assertThrows(NullPointerException.class, //NumberFormatException try also this not working or just exception type
				()-> {System.out.print("exception executed"); 
				str.length();});
			
	}
	
	/* assigment
	 * 
	 * Integer.parseInt("ali can"); throws NumberFormatException
	 * create test method
	 
	 * 
	 */
	
	@Test
	void testException2() {
		
	String str="ALI CAN"; //TRY 123
	
	assertThrows(NumberFormatException.class,
			
			()->{
				Integer.parseInt(str);
			}
						
			);

	}
	
	/*
	 * dividing  by 0 throws ArithmeticException
	 * create test method  
	 */
	
	@Test
	void testException3() {
		int num1=123;
		int num2=0;
		assertThrows(ArithmeticException.class,()->divide(num1,num2)
		);
		
	}
	
	int divide(int a,int b) {
		
		return a/b;
	}

	/*
	 * negative values for ages should throw IllegalArgumentException
	 * create test method
	 */
	
	@Test
	void testException04(){
		int age=-12;
		assertThrows(IllegalArgumentException.class,()->checkAge(age));
		
	}
	private void checkAge(int num){
		if(num<0) {
		throw new IllegalArgumentException(); 
		}else {
			System.out.println(num);
		}	
	
	}	
}
