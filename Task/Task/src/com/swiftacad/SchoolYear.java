package com.swiftacad;

import java.util.Scanner;

public class SchoolYear {

	public static void main(String[] args) throws Exception {
		School frenchHighSchool = new School();
		School neg = new School();
		
		
		Teacher kancheto = new Teacher("Kancheto", new Discipline("Deutsch", 20), new Discipline("Kreshti", 40));
		Teacher icoIcev = new Teacher("Ico Icev", new Discipline("Kolegiyata", 2));
		Teacher greggery = new Teacher("Greggery", new Discipline("Kaparirane", 2));
		Teacher manova = new Teacher("Manova", new Discipline("PE", 3));

		Student stoian = new Student("Stoian", 1, 5.60);
		Student kalin = new Student("Kalin", 2, 5.90);
		Student niki = new Student("Niki", 3, 3.20);
		Student iliyan = new Student("Iliyan", 4, 5.49);
		Student vergo = new Student("Vergil", 5, 6.10);
		Student desi = new Student("Desi", 6, 5.40);
		Student vlado = new Student("Vlado", 7, 5.50);
		Student tedi = new Student("Tedi", 8, 5.70);
		Student kateto = new Student("Kateto", 9, 5);

		Class geography = new Class(greggery, stoian, vergo, kateto);
		Class pe = new Class(manova, vlado, tedi, kateto);
		Class chemistry = new Class(icoIcev, stoian, kalin, niki);
		Class deutsch = new Class(kancheto, iliyan, vergo, desi);

		neg.assignNewClass(pe);
		neg.assignNewClass(geography);
		frenchHighSchool.assignNewClass(chemistry);
		frenchHighSchool.assignNewClass(deutsch);
		System.out.println(kancheto);
		System.out.println(pe);
		System.out.print("Please enter a number: ");
		System.out.println("Top student in class is: " + pe.topStudent(new Scanner(System.in).nextInt()));
		System.out.printf("Average score of class PE is: %.2f \n", geography.calculateAverage());
	}
}
