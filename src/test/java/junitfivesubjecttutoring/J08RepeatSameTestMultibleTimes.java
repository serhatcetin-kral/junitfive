package junitfivesubjecttutoring;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class J08RepeatSameTestMultibleTimes {

	//test substring if it gives same outputwhen you use it 10 times
	
	@RepeatedTest(10)
	void subStringTest() {
		System.out.println("sub string test executed");
		assertEquals("java","java programing language".substring(0,4));
		
	}
	
	//tasr addExact() in java math classif it is working as expected for first  10 pozitif number
	//1+2  /2+3/ 3+4
	
	static int x=1;
	 static int y=2;
	static int result=3;
	
	@RepeatedTest(10)
	void addExactTest() {
		assertEquals(result,Math.addExact(x, y));
		System.out.println(result);
		x+=1;
		y+=1;
		result+=2;
		
	}
	
	
	
	
	
	
	
	
	
}
