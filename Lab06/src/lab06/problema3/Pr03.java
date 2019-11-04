package lab06.problema3;

import java.util.ArrayList;

public class Pr03 {

	public static  void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add(4);
		lista.add(3);
		try {
			System.out.println(lista.get(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Print dupa catch");
		

	}

}
