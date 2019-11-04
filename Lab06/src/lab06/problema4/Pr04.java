package lab06.problema4;

public class Pr04 {

	public static void main(String[] args) {
		
		Exceptii a = new Exceptii("Salut");
		a.Afisare();
		try{
			throw new Exceptii(":-");
		}
		catch(Exception Exceptii){
			System.out.println("Nope");
		}
		
		
		
	}

}
