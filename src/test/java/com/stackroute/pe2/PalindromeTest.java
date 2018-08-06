package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
	
	private static Palindrome p;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		p = new Palindrome();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		p = null;

	}

	@Test
	public void paltest() {
		boolean result=p.pal("abc");
		assertEquals(result,false);
		result=p.pal("123");
		assertEquals(result,false);
		
	}
	@Test
	public void pal2test() {
		boolean result=p.pal("madam");
		assertEquals(result,true);
		result=p.pal("121");
		assertEquals(result,true);
		
	}




}
