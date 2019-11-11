package lab06.problema8;

public class ClasaA {
	ClasaA(){
		System.out.println("Constructor clasaA");
		
	}
	static void f() throws MyException
	{
		
		System.out.println("Functia f");
		try {
			g();
		} catch (MyException e) {
			
			
			throw e;
		}
	}
	static void g() throws MyException {
		System.out.println("Functia g");
		throw new MyException();
	}
	
}
