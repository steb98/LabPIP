package model2020.problema1;

import model2020.problema1.Disciplina.Student;

public class Main {

	public static void main(String[] args) {
		
		Disciplina d= new Disciplina("mate", "grea");
		Disciplina.Student s1;
		d.grupa = new Disciplina.Student[3];
		try {
			s1 = d.new Student(3, 5);
			s1.numeStudent="Mirel";
			d.grupa[0] = s1;
		} catch (Exception e) {
			System.out.println("Date incorecte 1");
		}
		
		Disciplina.Student s2;
		try {
			s2 = d.new Student(5, 3);
			s2.numeStudent="Dorel";
			d.grupa[1] = s2;
		} catch (Exception e) {
			System.out.println("Date incorecte 2");
		}
		
		Disciplina.Student s3;
		try {
			s3 = d.new Student(6, 8);
			s3.numeStudent="Vostel";
			d.grupa[2] = s3;
		} catch (Exception e) {
			System.out.println("Date incorecte 3");
		}
		for(int i =0 ; i<d.grupa.length;i++) {
			System.out.println(d.grupa[i].toString());
		}
		
		
	}

}
