package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;




public class StudentTest {

private static Student student;
 
	
	@BeforeClass
	public static void setup() {
		student = new Student();
	}
	
	@AfterClass
	public static void teardown() {
		student = null;
	}

	@Test
	public void avg() {
		int a[] = {80,70,90,60};
		int s = student.avg(a);
		assertEquals(s,75);
	}
		
		
	@Test
	public void min() {
		int a1[] = {80,70,90,60};
		int s = student.min(a1);
		assertEquals(s,60);
	}
	
	@Test
	public void max() {
		int a2[] = {80,70,90,60};
		int s = student.max(a2);
		assertEquals(s,90);
	}
}
