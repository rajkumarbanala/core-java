package com.example.demo.designPatterns;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassExampleTest {

	public static void main(String[] args) {
		
		Map<String, Object> metaData = new HashMap<>();
		metaData.put("key1", "value1");
		metaData.put("key2", "value2");
		
		ImmutableClassExample i = new ImmutableClassExample("01", "aaa", metaData);
		System.out.println("id:" + i.getId());
		System.out.println("name:" + i.getName());
		System.out.println("name:" + i.getMetaData());

		metaData.put("key3", "value3");
		System.out.println("name:" + i.getMetaData());
	}
}

/** add final keyword to class */
final class ImmutableClassExample {

	/** add final keyword to variable */
	private final String id;

	private final String name;

	private final Map<String, Object> metaData;

	public ImmutableClassExample(String id, String name, Map<String, Object> metaData) {
		// deep copy
		Map<String, Object> tmpData = new HashMap<>();
		metaData.forEach((k, v) -> tmpData.put(k, v));

		this.id = id;
		this.name = name;
		this.metaData = tmpData;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<String, Object> getMetaData() {
		Map<String, Object> tmpData = new HashMap<>();
		metaData.forEach((k, v) -> tmpData.put(k, v));
		return tmpData;
	}
}
