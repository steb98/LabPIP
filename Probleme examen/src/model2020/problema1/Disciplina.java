package model2020.problema1;

public class Disciplina {
	
	String numeDisciplina;
	String tipDisciplina;
	Student[] grupa;
	
	Disciplina(String nD,String tD){
		numeDisciplina=nD;
		tipDisciplina=tD;
	}
	
	class Student implements NoteCatalog{
		String numeStudent;
		int notaLaborator;
		int notaExamen;
		
		Student(int nL,int nE) throws Exception{
			if(nL<1 || nL>10 || nE<1 || nE>10)
				throw new Exception();
			else {
				
				notaLaborator=nL;
				notaExamen=nE;
			}
		
			
			
		}

		public int getNotaLaborator() {
			return notaLaborator;
		}

		public int getNotaExamen() {
			return notaExamen;
		}

		@Override
		public String toString() {
			//return super.toString();
			String a = "Studentul "+numeStudent+"are notele "+notaLaborator+" si "+notaExamen;
			return a;
		}
		
		
		
	}

}
