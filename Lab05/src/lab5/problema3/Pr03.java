package lab5.problema3;

import java.util.ArrayList;

public class Pr03 {

	public static void main(String[] args) {
		ArrayList<Student> studentList= new ArrayList<Student>();
		for(int i=1;i<19;i++){
			studentList.add(new Student("Studentul nr "+i));
	}
		
		for(int i=1;i<studentList.size();i++){
			System.out.println(studentList.get(i).NumePrenume);
		}
}
}