package Junit5utorial;

public class C01StringModifier {


	//AABC==>BC     ABC==>BC  BCD==>BCD BCAA==>BCAA A=>""  B=>B	
public String deleteAIfItIsInFirstTwoPosition(String str) {
	if(str.length()<=2) {
	return str.replaceAll("A","");
	}	
	
	
	String firstTwo=str.substring(0,2);
	String afterFirstTwo=str.substring(2);
	
	return firstTwo.replaceAll("A", "")+afterFirstTwo;
		
}	
	
	
}
