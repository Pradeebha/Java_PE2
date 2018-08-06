package com.stackroute.pe2;

public class Palindrome {
	public boolean pal(String s) {
		String rev="";
		int n=s.length();
		for(int i=n-1;i>=0;i--)
			rev=rev+s.charAt(i);
		if(rev.equals(s)) return true;
		else return false;

	}
}
