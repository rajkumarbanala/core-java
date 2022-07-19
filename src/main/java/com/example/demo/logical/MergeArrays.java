package com.example.demo.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrays {

	public static void main(String[] args) {

		Integer[] a = new Integer[] { 1, 2, 3 };
		Integer[] b = new Integer[] { 4, 5, 6, 3, 7 };

		System.out.println("a:" + Arrays.asList(a));
		System.out.println("b:" + Arrays.asList(b));

		// merge using stream api
		Object[] c = Stream.of(a, b).flatMap(Stream::of).toArray();
		System.out.println("output:" + Arrays.asList(c));

		// map() to execute a function on every element of a stream
		List<String> list = Arrays.asList("a", "b", "c");
		List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("list:" + list);
		System.out.println("upperCase:" + upperCase);

		// flatMap() converts a stream of collections into a single “flat” stream
		List<String> list1 = Arrays.asList("a", "b", "c");
		List<String> list2 = Arrays.asList("d", "e", "f");
		List<String> list3 = Arrays.asList("f", "g", "h");
		List<String> list4 = Arrays.asList("i", "b", "f");

		List<List<String>> list5 = Arrays.asList(list1, list2, list3, list4);
		List<String> list6 = list5.stream().flatMap(tmp->tmp.stream()).collect(Collectors.toList());
		System.out.println("list6:" + list6);

	}

}
