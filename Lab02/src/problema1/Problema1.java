package problema1;


class Student{
	long numarMatricol;
	String numePrenume;
	int anStudiu;
	
	Student(String nume, int anStudiu){
		numarMatricol = 0;
		numePrenume= nume;
		this.anStudiu= anStudiu;
	}
	Student(long numarMatricol , String numePrenume){
		this.numePrenume=numePrenume;
		this.numarMatricol= numarMatricol;
		this.anStudiu=1;
	}
	Student(long numarMatricol, String numePrenume, int anStudiu){
		this.anStudiu=anStudiu;
		this.numarMatricol=numarMatricol;
		this.numePrenume=numePrenume;
	}
	Student(Student s){
		numarMatricol=s.numarMatricol;
		numePrenume=s.numePrenume;
		anStudiu=s.anStudiu;
	}
	Student(String numePrenume,float anStudiu){
		this.numePrenume=numePrenume;
		this.anStudiu= (int) anStudiu;
	}
	boolean isValidStudent(Student s){
		if(s.numePrenume==null || s.numarMatricol==0 || s.anStudiu==0)
			return false;
		return true;
	}
	void printStudent(){
		System.out.println(numePrenume + " " + anStudiu + " " + numarMatricol+" " + this.isValidStudent(this));
	}
}



public class Problema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!"); //sysout ^+space
		
		Student s1 = new Student("Popescu Alex", 3);
		Student s2 = new Student(s1);
		Student s3 = new Student(23,"Pop Vlad");
		Student s4 = new Student(24, "Ionescu Bogdan", 2);
		Student s5 = new Student("Test", 3.1f);
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s4.printStudent();
		s5.printStudent();
		
	}

}
