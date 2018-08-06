package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class Powerof4Test {
	private static Powerof4 p;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		p = new Powerof4();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		p = null;

	}


	@Test
	public void checkpowertest1() {
		boolean result=p.checkpower(16);
		assertEquals(result,true);
		result=p.checkpower(20);
		assertEquals(result,false);
		result=p.checkpower(0);
		assertEquals(result,false);
		result=p.checkpower(1);
		assertEquals(result,true);
	}
	
				


}
