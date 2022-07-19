package com.example.demo.java8;

public class StaticMethods {

	public static void main(String[] args) {

		StaticMethodInterface.staticMethod();
//		no need to create object to call static methods. directly we can call with class name or interface name
//		StaticMethodInterface smi= new StaticMethodClass();
//		smi.staticMethod();

	}

}

interface StaticMethodInterface {

	public static void staticMethod() {
		System.out.println("staticMethod");
	}

}

class StaticMethodClass implements StaticMethodInterface {

}