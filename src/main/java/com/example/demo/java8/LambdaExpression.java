package com.example.demo.java8;

import java.util.function.BiConsumer;

public class LambdaExpression {

	public static void main(String[] args) {

		// no methodname, return type, access modifier, arguments
		// only one lambda sysmbol ->
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept(10, 10);
		biConsumer.accept(10, 20);

	}

}
