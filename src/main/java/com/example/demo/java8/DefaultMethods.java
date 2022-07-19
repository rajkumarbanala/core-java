package com.example.demo.java8;

public class DefaultMethods {

	public static void main(String[] args) {
		
		DefaultMethodInterface dmi = new DefaultMethodClass();
		
		dmi.abstractMethod();
		
		dmi.defaultMethod();
	}

}

interface DefaultMethodInterface {

	public void abstractMethod();

	// Default methods are allowed only in interfaces.
	default void defaultMethod() {
		System.out.println("defaultMethod()");
	}
}

class DefaultMethodClass implements DefaultMethodInterface {

	public void abstractMethod() {
		System.out.println("abstractMethod()");
	}

//	default void defaultMethod1() {
//		System.out.println("defaultMethod()");
//	}
}