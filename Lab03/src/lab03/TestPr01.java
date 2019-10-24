package lab03;

import lab03.proceduri.Adauga;
import lab03.proceduri.Agregat;
import lab03.proceduri.Piesa;
import lab03.proceduri.Subsistem;

public class TestPr01 extends Adauga {
	

	 void oMetoda(){
		new Adauga().add(new Piesa());
		
	}

	public static void main(String[] args) {
		Adauga ad = new Adauga();
		Piesa p1=new Piesa();
		Piesa p2=new Piesa();
		Piesa p3=new Piesa();
		Agregat a1= new Agregat();
		Agregat a2= new Agregat();
		Subsistem ss1 = new Subsistem();
		ad.add(p1);
		ad.add(p2);
		ad.add(p3);
		ad.add(a1);
		ad.add(a2);
		ad.add(ss1);
		new TestPr01().oMetoda();

	}

}
