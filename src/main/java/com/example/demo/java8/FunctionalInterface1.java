package com.example.demo.java8;

public class FunctionalInterface1 {

	// one abstract method
	// multiple static, default methods
	// ex: Runnable,
	// why: we can use lambda expressions to instantiate them and avoid using bulky anonymous class implementation.
	public static void main(String[] args) {
		System.out.println("main()");
		
		beforeJava8();
		java8LambdaExpression();
	}

	// anonymous inner class objects or implement these interfaces
	static void beforeJava8() {
		
		// anonymous inner class objects or implement these interfaces
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("run method1");

			}
		});
		t.start();
	}

	// lambda expression
	static void java8LambdaExpression() {
		Thread t = new Thread(() -> {
			System.out.println("run method2");
		});
		t.start();
	}
}
