package com.swiftacad;

public class Teacher extends Person {
	public  Discipline[] disciplines;
	
	public Teacher(String name, Discipline... disciplines) {
		super(" ");
		this.disciplines = disciplines;
	}
	@Override
	public String toString() {
		String s1 = "Teaches in: %s. Weekly classes are: %s. \n";
		String s2 = " ";
		for(Discipline d : disciplines) {
			s2+= String.format(s1, d.name,d.hoursOfWeek);
		}
		return String.format("Teacher is: %s.%s", name, s2);
	}
}
