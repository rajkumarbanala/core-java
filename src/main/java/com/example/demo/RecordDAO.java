package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class RecordDAO {

	public List<Record> get(String startDate, String endDate) {
		System.out.println("get()");

		List<Record> list = new ArrayList<>();

		Record r1 = new Record();
		r1.setId("1");
		r1.setName("sample");
		r1.setEmail("sample1@gmail.com");

		Record r2 = new Record();
		r2.setId("1");
		r2.setName("sample");
		r2.setEmail("sample1@gmail.com");

		Record r3 = new Record();
		r3.setId("1");
		r3.setName("sample");
		r3.setEmail("sample1@gmail.com");

		list.add(r1);
		list.add(r2);
		list.add(r3);

		return list;
	}

}
