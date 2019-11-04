package lab06.problema5;

import java.util.ArrayList;

public class Pr05 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Ana");
		lista.add("are");
		lista.add("mere");
		lista.add("?");
		int i=0;
		while(true){
			try{
				if(lista.get(i)=="?")throw new Exception();
				System.out.println("Nu sunt exceptii");
				
			}
			catch(Exception e){
				System.out.println("Exceptie aruncata la ? ");
				break;
			}
			finally{
				i++;
			}
		}
		System.out.println("Am iesit din bucla");
		
	}

}
