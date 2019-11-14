package lab4.tema.P7;

public class TestPr07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClasaExterioara cx=new ClasaExterioara();
		ClasaExterioara.ClasaIn ci = cx.new ClasaIn();
		ci.metoda3();
		ClasaExterioara.ClasaInStatica cis = new ClasaExterioara.ClasaInStatica();
		cis.metoda1();
		ClasaExterioara.ClasaInStatica.metoda2();

	}

}
