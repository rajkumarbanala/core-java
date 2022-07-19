package com.example.demo.java8;

public class MethodReference1 {

	// replacement of lambda expression
	// code reusability
	public static void main(String[] args) {

		// scenario: staticMethod
		FunctionalInterface2 functionalInterface2 = Test::staticMethod;
		functionalInterface2.singleAbstractMethod();

		// scenario: static method
		Thread t2 = new Thread(Test::staticMethod);
		t2.start();
		
		// scenario: non staticMethod
		Test test1 = new Test();
		FunctionalInterface2 functionalInterface3 = test1::nonstaticMethod;
		functionalInterface2.singleAbstractMethod();

		// scenario: non staticMethod
		FunctionalInterface2 functionalInterface4 = new Test()::nonstaticMethod;
		functionalInterface4.singleAbstractMethod();
		
		// scenario: constructor
		FunctionalInterface2 functionalInterface5 = Test::new;
		functionalInterface5.singleAbstractMethod();
		
		// scenario: constructor
		Messable functionalInterface6 = Test::new;
		functionalInterface6.getTest("hello");

	}

}

class Test {
	
	Test() {
		System.out.println("test() constructor");
	}
	
	Test(String msg) {
		System.out.println("test(msg) constructor:"+msg);
	}

	public static void staticMethod() {
		System.out.println("method reference staticMethod()");
	}

	public void nonstaticMethod() {
		System.out.println("method reference nonstaticMethod()");
	}
}

interface Messable {
	Test getTest(String message);
}