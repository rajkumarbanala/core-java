package com.example.demo.logical;

public class SwapValuesWithoutVariable {

	public static void main(String[] args) {
		
		String s1 = "rajkumar";
		String s2 = "developer";
		
		System.out.println("before s1:" + s1);
		System.out.println("before s2:" + s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("after s1:" + s1);
		System.out.println("after s2:" + s2);
	}

}
