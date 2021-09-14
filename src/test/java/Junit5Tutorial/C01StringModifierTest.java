package Junit5Tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Junit5utorial.C01StringModifier;

class C01StringModifierTest {
	//AABC==>BC     ABC==>BC, BAC=>BC, BCD==>BCD, BCAA==>BCAA AA=>"",A=>""  B=>B
	
	C01StringModifier strToModifier=new C01StringModifier();
	
	
//	C01StringModifier strToModifier;     bu kismi daha sonra yaz
//	
//	@BeforeEach
//	void setUp() {
//		strToModifier=new C01StringModifier();
//		System.out.println("before each");
//	}
//	
//	@AfterEach
//	void tearDown() {
//		strToModifier=null;
//		System.out.println("after each each");
//	}
	
	
	
	
	@ParameterizedTest
	@CsvSource(value= {"BC,AABC","BC,ABC","BC,BAC","BCD,BCD","BCAA,BCAA"," '',AA","'',A","B,B"})
	void deleteAIfItIsInFirstTwoPositionTest(String expected,String actual) {
		assertEquals(expected,strToModifier.deleteAIfItIsInFirstTwoPosition(actual));
		
		System.out.println("executed method");
	}

}
