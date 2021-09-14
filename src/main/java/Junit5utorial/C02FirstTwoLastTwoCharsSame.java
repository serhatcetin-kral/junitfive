package Junit5utorial;

public class C02FirstTwoLastTwoCharsSame {

	//ABAB =>TRUE, AB=>TRUE,   ABCD=>FALSE ,   ABBA=>FALSE  A=>FALSE
	
	public  boolean checkIfFirstTwoLastTwoCharsSame(String str) {
		if(str.length()<=1) {
		return false;
		}
	if(str.length()<=2) {
		return true;
		
	}
	
	String firstTwo=str.substring(0,2);
	String lastTwo=str.substring(str.length()-2);
	return firstTwo.equals(lastTwo);
	}
}
