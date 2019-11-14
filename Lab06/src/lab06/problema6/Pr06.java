package lab06.problema6;

public class Pr06 {
	
	static void metoda() throws E1,E2,E3{
		int a =(int)(Math.random() * ((2 - 0) + 1)) + 0;
		switch (a) {
		case 0:
			throw new E1();
			
		case 1:
			throw new E2();
			
		case 2:
			throw new E3();
			
		default:
			break;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			metoda();
		} catch (Exception e) {
			if(e instanceof E1){
				System.out.println("Am rezolvat E1");
			}
			else if(e instanceof E2)
			{
				System.out.println("Am rezolvat E2");
			}
			else if(e instanceof E3){
				System.out.println("Am rezolvat E3");
			}
		}
		
	}

}
