package lab5.problema1;

import java.util.*;

public class Pr01 {

	public static void main(String[] args) {
		String exp = "+u+s+c-+e+r+t-+a-+i-+s+t+r-+y+u-+l+e+s";
		//task 1: printare caracter linie cu linie
		for(int i=0;i<exp.length();i++){
			System.out.println(exp.substring(i,i+1));
			//se mai poate si cu charAt()
			}
		System.out.println("-----------------");
		
		
		//task 2: create a stack si push si pop
		Stack s = new Stack<String>();
		for(int i=0;i<exp.length();i++)
			s.push(exp.charAt(i));
		
			
		System.out.println(s.toString());
		System.out.println("-----------------");
		//task 3: verificare string 
		
		Stack s1 = new Stack<String>();
		String c;
		//verificare string
		
		for(int i=0;i<exp.length();i++)
		{
			c=exp.substring(i,i+1);
			if(c.compareTo("+") == 0){
				s1.push(exp.substring(i+1,i+2));
			}
			if(c.compareTo("-") == 0){
				s1.pop();
			}
					
		}
		//scoatere din stiva
		System.out.println(s1.toString());
	}

}
