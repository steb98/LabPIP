package lab06.problema7;

import lab06.problema2.Test;

public class Pr07 {

	public static void main(String[] args) {
		Test a = new Test();
		Boolean ok = false;
		try {
			System.out.println(a.test);
		} catch (Exception e) {
			System.out.println("vezi ca ai facut buba");
			e.printStackTrace();
			ok=true;
		}
		finally{
			if(ok)
				System.out.println("Ai intrat in catch");
			else{
				System.out.println("Nu ai avut exceptie");
			}
		}
		
		System.out.println("Print dupa catch");

	}

}
