//exemplu de folosire a HT
//"Cristina"  nota 10; "iustina" nota 1 ...
//h.put("Cristina",10)
//numele e cheia si 10 e valoarea 
//pt exxtragere valorii: h.get("Cristina")
//test pt a vedea daca vheia exista in tablou h.containsKey




package lab5.problema2;

import java.util.Hashtable;

public class Pr02 {

	public static void main(String[] args) {
		String exp = "Radacinele educatiei sunt amare, dar fructele sunt dulci.";
		Hashtable  <String,Integer> ht = new Hashtable <String,Integer>();
		for(int i=0;i<exp.length();i++)
		{
			String c = exp.substring(i, i+1);
			if(ht.containsKey(c)){
				int j=ht.get(c);
				j++;
				ht.put(c, j);
			}
			else{
				ht.put(c, 1);
			}
				
		}
		
		System.out.println(ht);		
		
	}

}
