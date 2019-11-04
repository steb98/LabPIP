package lab06.problema2;

public class Pr02 {
	
	public static void main(String [ ] args){
		
		Test a = null;
		
		try {
			System.out.println(a.test);
		} catch (Exception e) {
			System.out.println("vezi ca ai facut buba");
			e.printStackTrace();
		}
		
		System.out.println("Print dupa catch");
		
	}

}
