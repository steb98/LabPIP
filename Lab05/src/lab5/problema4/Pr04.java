package lab5.problema4;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Random;

public class Pr04 {

	public static void main(String[] args) {
		ArrayList<BitSet> ba = new ArrayList<BitSet>();
		Random rand =new Random();
		for(int k=0;k<6;k++) {
			
			ba.add(new BitSet());
			long number = rand.nextLong();
			if(number<0) number=number*(-1);
			
			int i = 0;
			while(number!=0) {	
				while(Math.pow(2, i)<=number) 
					i++;
				i--;
			
				
				ba.get(k).set(i);
				number=(long) (number-Math.pow(2, i));
				i=0;
			}
			
			
			
		}
		for(int i = 0;i<ba.size();i++) {
			System.out.print(i+1 + ". ");
			System.out.println(ba.get(i));
		}
		}
		
	}

