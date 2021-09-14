package junitfivesubjecttutoring;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class J09PerformanceTest {

//create method print integer number from 1 to 1000000 on the console
	//task if this task can be complated in 3 seconds
	
	@Test
	@Disabled // disable stop testing
	void printPerformance1() {
		
		assertTimeout(Duration.ofSeconds(4),()->IntStream.rangeClosed(1, 1000000).forEach(System.out::println));
		
	}
	
	
	@Test
	void printPerformance2() {
		
		assertTimeout(Duration.ofSeconds(1),()->IntStream.rangeClosed(1, 1000).reduce((x,y)->Math.addExact(x, y)));		
	}
}
