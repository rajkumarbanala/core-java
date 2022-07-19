package com.example.demo.java8;

@FunctionalInterface
public interface FunctionalInterface2 {
	
	void singleAbstractMethod();
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2");
	}

	default void defaultMethod3() {
		System.out.println("defaultMethod3");
	}
}
