package abc;

import java.util.Scanner;

public class OperadoresLogicosRelacionais {//OPERADOR TERNARIO
 public static void main(String[] args) {
	/*int n1,n2,r;
	n1=4;
	n2=8;
	r= (n1>n2)? 0:1;  // SE N1 FOR MAIOR QUE N2 VAI IMPRIMIR 0 SE NÃO FOR VAI IMPRIMIR 1
	System.out.println(r);*/
	/* int x,y,z;  // OPERADORES LÓGICOS VERDADEIRO OU FALSO
	 x=4;
	 y=7;
	 z=12;
	 boolean r;
	 r=(x<y && y<z)? true : false ;
	 System.out.println(r);*/
	 
	/* try (Scanner teclado = new Scanner(System.in)) { //estruturas condicionais CONDIÇÃO SIMPLES
		 System.out.println("Primeira nota ");
    float n1 = teclado.nextFloat();
    System.out.println("Segunda nota ");
    float n2 = teclado.nextFloat();
    float m = (n1+n2)/2 ;
    System.out.println("Sua média foi " + m);
    if (m>9) {
    	System.out.println("Parabéns"); 
          }
   }	
}
}*/
	 /*try (Scanner teclado = new Scanner(System.in)) { // CONDIÇÃO COMPOSTA 
		 System.out.println("Em que ano voce nasceu ?" );
		 int nasc = teclado.nextInt();
		 int i = 2015 - nasc;
		 System.out.println("Sua idade é  "+ i);
		 if (i >=18) {
			 System.out.println("Maior de Idade");
		 } else {
			 System.out.println("Menor Idade");
		 }
		 }
 }
}*/
	/* try (Scanner teclado = new Scanner (System.in)) {  // Condição composta Encandeada
	      System.out.println("Em que ano voce nasceu? ");
		 int nasc = teclado.nextInt();
		 int i = 2012 - nasc;
		 if (i<16) {
		 System.out.println("Voce não vota ");
		 }
		 else
		 {
		if ( (i>=16 && i<18) || (i>70)) {
				 System.out.println("Seu voto e Opcional");
			 } 
			 else {
				 System.out.println(" Seu voto e obrigatorio");
			 }
			
		 }
	 }
 }
}*/
	 
	 try(Scanner teclado = new Scanner (System.in)) { // Condição multipla escolha
		 System.out.println("Quantas pernas? ");
	     int perna = teclado.nextInt();
	     System.out.println("Isso é um(a)");
	      String tipo;
	     switch (perna) {
	     case 1:
	    	 tipo = "Saci";
	    	 break;
	     case 2 :
	    	 tipo = "bípede";
	    	 break;
	     case 3:
	    	 tipo = "tripede";
	    	 break;
	     case 4:
	    	 tipo = "quadrupede";
	    	 break;
	     case 6:
	    	 tipo = " aranha";
	    	 break;
	    	 default:
	    		 tipo = "ET";
			break;
	     }
	     System.out.println(tipo);
	 }
	 
	    	 
	     }
	 }
			 
		 
  
		 
		 
	 
	 
		
