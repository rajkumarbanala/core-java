package com.example.demo.java8;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerInterfaceJava8 {

	public static void main(String[] args) {

		// A Consumer is a functional interface that accepts a single input and returns no output
		Consumer<String> consumer = name -> System.out.println("name:" + name);

		Stream<String> names = Stream.of("aaa", "bbb", "ccc");
		names.forEach(name -> {
			consumer.accept(name);
		});
	}

}
