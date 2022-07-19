package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {

		List<String> listString = new ArrayList<>();
		listString.add("BALL");
		listString.add("APPLE");
		listString.add("CAT");

		/** ========= Terminal & non-Terminal Operations ========= */
		long count = listString.stream().map((v) -> {
			return v.toLowerCase();
		}).count();
		System.out.println("count:" + count);

		List<String> listStringNew = new ArrayList<>();
		count = listString.stream().map((v) -> {
			if (v.equals("APPLE")) {
				System.out.println("No Display:" + v);
				listStringNew.add(v);
				return v.toLowerCase();
			} else {
				System.out.println("No Display:" + v);
				return null;
			}
		}).count();
		System.out.println("listString:" + listString);
		System.out.println("listStringNew:" + listStringNew);
		System.out.println("count:" + count);

		/** ========= Filter ========= */
		System.err.println("Stream Filter:");
		Stream<String> streamList = listString.stream().filter((v) -> {
			return v.equals("APPLE") || v.equals("BALL");
		});
		streamList.forEach(v -> System.out.print(v + ", "));

		List<EmployeStream1> employeeList = EmployeStream1.getList();
		List<EmployeStream1> employeeListFilter = employeeList.stream().filter(e -> e.getName().equals("aaa"))
				.collect(Collectors.toList());
		System.out.println();
		employeeListFilter.forEach(e -> System.out.print(e.getName() + ", "));

		Map<String, EmployeStream1> employeeMapFilter = employeeList.stream().filter(e -> e.getName().equals("aaa"))
				.collect(Collectors.toMap(v -> (String) v.getName(), v -> (EmployeStream1) v));
		System.out.println();
		employeeMapFilter.forEach((k, v) -> System.out.print(k + ":" + v + ", "));

		/** ========= Sorting ========= */
		System.err.print("\nList sort Stream: ");
		listString.stream().sorted().forEach(v -> System.out.print(v + ", "));

		System.err.print("\nEmployee sort Comparable:");
		employeeList = EmployeStream1.getList();
		Collections.sort(employeeList, new Comparator<EmployeStream1>() {
			@Override
			public int compare(EmployeStream1 o1, EmployeStream1 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		employeeList.forEach(e -> System.out.print(e + ", "));

		System.err.print("\nEmployee sort Stream:");
		employeeList = EmployeStream1.getList();
		employeeList = employeeList.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
		employeeList.forEach(e -> System.out.print(e + ", "));

		System.out.println("\nRef Comparision:" + (employeeList.get(0) == new EmployeStream1("06", "aaa", 600)));
		System.out.println("Data Comparision by override equals method:"
				+ (employeeList.get(0).equals(new EmployeStream1("06", "aaa", 600))));

	}
}

class EmployeStream1 {

	private String id;

	private String name;

	private double sal;

	public EmployeStream1() {
	}

	public EmployeStream1(String id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public static List<EmployeStream1> getList() {
		List<EmployeStream1> list = new ArrayList<>();
		list.add(new EmployeStream1("02", "bbb", 200));
		list.add(new EmployeStream1("03", "ccc", 300));
		list.add(new EmployeStream1("04", "ddd", 400));
		list.add(new EmployeStream1("05", "eee", 600));
		list.add(new EmployeStream1("06", "eee", 500));
		list.add(new EmployeStream1("01", "aaa", 100));
		return list;
	}

	@Override
	public boolean equals(Object e) {
		return this.name.equals(((EmployeStream1) e).getName());
	}

	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + sal + "]";
	}

}
