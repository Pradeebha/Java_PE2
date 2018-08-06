package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;




public class FactorialTest {
	private static Factorial factorial;

	@BeforeClass
	public static void setup() {
		factorial = new Factorial();
	}
	
	@AfterClass
	public static void teardown() {
		factorial = null;
	}

	@Test
	public void testTrue() {
		int ans;
		ans=factorial.fact(2);
		assertEquals(2,ans);
		
	}
	
	@Test
	public void test() {
		int res=factorial.fact(12);
		assertEquals(479001600,res);
    }
}
