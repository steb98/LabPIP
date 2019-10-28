package lab4.probleme;

public class TestPr01 {

	static void printAutomobil(Autovehicul a){
		if(a instanceof Berlina)
			((Berlina)a).printBerlina();
		else
			((Sport)a).printSport();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Berlina b = new Berlina();
		b.tipAutomobil();
		b.printBerlina();
		System.out.println("- 1. -");
		Autovehicul s = new Sport();
		s.tipAutomobil();
		((Sport) s).printSport(); 
		System.out.println("- 2. -");
		Object m = new Sport();
		((Autovehicul) m).tipAutomobil(); 
		TestPr01.printAutomobil(b);
		TestPr01.printAutomobil(s);
		TestPr01.printAutomobil((Autovehicul)m);
	}

}
