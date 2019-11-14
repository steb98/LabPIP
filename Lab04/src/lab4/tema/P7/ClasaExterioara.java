package lab4.tema.P7;

public class ClasaExterioara {
	
	ClasaIn a=new ClasaIn();
	ClasaInStatica b=new ClasaInStatica();
	
	 ClasaExterioara() {
		System.out.println("Constr. ClasaExt");
	}
	 
	 
	class ClasaIn{
		ClasaIn(){
			System.out.println("Constr ClasaIn");
		}
		void metoda3() {
			System.out.println("metoda 3");
		}
	}
	static class ClasaInStatica{
		public ClasaInStatica() {
			System.out.println("Constr. ClasaInStatica");
		}
		void metoda1() {
			System.out.println("Metoda 1");
		}
		static void metoda2() {
			System.out.println("metoda2");
		}
	}
	
}
