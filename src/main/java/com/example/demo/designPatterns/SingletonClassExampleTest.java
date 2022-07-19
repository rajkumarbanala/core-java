package com.example.demo.designPatterns;

class SingletonClassExample {

	private String id;

	private String name;

	/** make constructor private */
	private SingletonClassExample() {
	}

	/** disable setters */
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/** use static variable to hold instance */
	private static SingletonClassExample SINGLETON_CLASS_EXAMPLE;

	/** use static methods to return instance */
	public static SingletonClassExample getInstance() {

		if (SINGLETON_CLASS_EXAMPLE != null)
			return SINGLETON_CLASS_EXAMPLE;

		SINGLETON_CLASS_EXAMPLE = new SingletonClassExample();
		SINGLETON_CLASS_EXAMPLE.id = "01";
		SINGLETON_CLASS_EXAMPLE.name = "name";

		return SINGLETON_CLASS_EXAMPLE;
	}
}

public class SingletonClassExampleTest {

	public static void main(String[] args) {
		SingletonClassExample s1 = SingletonClassExample.getInstance();
		SingletonClassExample s2 = SingletonClassExample.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
