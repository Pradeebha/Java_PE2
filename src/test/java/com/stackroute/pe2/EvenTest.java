package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvenTest {
	private static Even even;

	@BeforeClass
	public static void setup() {
		even=new Even();
	}
	
	@AfterClass
	public static void teardown() {
	}

	@Test
	public void isEven() {
	boolean val;
	val = Even.iEven(2);
	assertEquals(true,val);
	
	}
	
	@Test
	public void isOdd() {
		boolean val;
		val = Even.iOdd(1);
		assertEquals(false,val);
		}
}
