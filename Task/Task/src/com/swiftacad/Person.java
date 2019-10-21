package com.swiftacad;

public class Person {
	protected final String name;

	public Person(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Provided value for name cannot be null or empty");
		}

		this.name = name;
	}
}
