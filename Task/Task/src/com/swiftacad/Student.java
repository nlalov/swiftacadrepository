package com.swiftacad;

public class Student extends Person {
	private final int id;
	final double grade;

	public Student(String name, int id, double grade) {
		super(" ");
		this.id = id;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("Student: %s, ID: %d, Grade: %.2f", name, id, grade);
	}
}
