package lab06.problema4;

public class Exceptii extends RuntimeException {
	
	String nume;
	Exceptii(String s){
		nume = s;		
	}
	void Afisare(){
		System.out.println(nume);
	}

}
