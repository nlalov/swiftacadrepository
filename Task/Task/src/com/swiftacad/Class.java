package com.swiftacad;

public class Class {
	private final Student[] students;
	private final Teacher teacher;

	public Class(Teacher teacher, Student... students) {
		this.teacher = teacher;
		this.students = students;
	}
	
	public String toString() {
		String s1 = "Students are:";
		for(Student s : students) {
			s1+= s.name + " ";
		}
		return String.format("Teacher in class: %s %s", teacher, s1);
		
	}
	
	public String topStudent(int position) {
		return students[position].toString();
	}
	
	public double calculateAverage() {
		double averageScore = 0;
		for(Student s : students) {
			averageScore += s.grade;
		}
		return averageScore/students.length;
	}

}
