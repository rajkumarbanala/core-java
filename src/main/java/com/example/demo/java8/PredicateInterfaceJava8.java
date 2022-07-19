package com.example.demo.java8;

import java.util.function.Predicate;

public class PredicateInterfaceJava8 {

	public static void main(String[] args) {

		Predicate<Integer> p = age -> (age >= 18);
		System.out.println("isEligible for 17:" + p.test(17));
		System.out.println("isEligible for 18:" + p.test(18));
		System.out.println("isEligible for 19:" + p.test(19));

		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		// Creating predicate
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println("and() predicate:" + result);

		// Calling Predicate method
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println("and(), negate() predicate:" + result2);

	}

}
