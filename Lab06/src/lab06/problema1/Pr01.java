package lab06.problema1;

public class Pr01 {

	public static void main(String[] args) {
		Test a = null;
		
		try {
			System.out.println(a.test);
		} catch (Exception e) {
			System.out.println("vezi ca ai facut buba");
			e.printStackTrace();
		}


	
	}
}
