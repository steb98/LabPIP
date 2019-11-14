package lab03.proceduri;

public class Adauga {
	Sistem sistem =new Sistem();
	public Adauga (){
		System.out.println("Constructor Adauga");
		
	}
	
	public Adauga add (Piesa p){
		return (this);
	}
	public Adauga add (Agregat a){
		return (this);
	} 
	public Adauga add (Subsistem s){
		return (this);
	}

}
