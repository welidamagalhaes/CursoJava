package Classe;

public class Datateste {

	public static void main(String [] args) {
		
		Data d1 = new Data ();
		 d1.dia = 18;
		 d1.mes = 12;
		 d1.ano = 1993;
		 
		 var d2 = new Data();
		 d2.dia= 2;
		 d2.mes = 7;
		 d2.ano = 1959;	
		 
		 String dataFormatada1 = d1.obterDataFormatada();
		 
		 
		 System.out.println(dataFormatada1);
		 System.out.println(d2.obterDataFormatada());
		 
		 d1.imprimirDataFormatada();
		 d2.imprimirDataFormatada();
		 
		 		
	}
}
