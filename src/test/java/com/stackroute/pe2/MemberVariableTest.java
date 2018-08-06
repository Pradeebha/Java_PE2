package com.stackroute.pe2;

import static org.junit.Assert.*;


import org.junit.Test;

public class MemberVariableTest {
	
	@Test
	public void test1() {
		MemberVariable m1=new MemberVariable("Harry Potter",30,2500.3);
		String result=m1.getvalues();
		assertEquals(result,"Harry Potter 30 2500.3");
		
	}
	

}