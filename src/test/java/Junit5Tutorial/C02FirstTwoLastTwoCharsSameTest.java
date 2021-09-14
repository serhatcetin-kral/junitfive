package Junit5Tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import Junit5utorial.C02FirstTwoLastTwoCharsSame;

class C02FirstTwoLastTwoCharsSameTest{
	//ABAB =>TRUE, AB=>TRUE,   ABCD=>FALSE ,   ABBA=>FALSE  A=>FALSE
	
	
	C02FirstTwoLastTwoCharsSame obj=new C02FirstTwoLastTwoCharsSame();
	
	@ParameterizedTest
	@CsvSource(value= {"TRUE,ABAB","TRUE,AB","FALSE,ABCD","FALSE,ABBA","FALSE,A"})
	void checkIfFirstTwoLastTwoCharsSameTest(boolean rs,String str) {
		
		assertEquals(rs,obj.checkIfFirstTwoLastTwoCharsSame(str));
		
}
	
	@ParameterizedTest
	@ValueSource(strings={"ABAB","AB"})
	void checkIfFirstTwoLastTwoCharsSameTest2(String str){
		assertTrue(obj.checkIfFirstTwoLastTwoCharsSame(str));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings={"ABBA","ABCD","A",""})
	void checkIfFirstTwoLastTwoCharsSameTest3(String str){
		assertFalse(obj.checkIfFirstTwoLastTwoCharsSame(str));
		
	}
}