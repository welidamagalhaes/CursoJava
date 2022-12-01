package abc;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		/*int n1 = 3;
		int n2 =5;
		float m = n1 + n2/2;
		System.out.println("A média é igua a " + m);*/
				
		/*int numero = 5; // incremento ex 1 OPERADORES UNÁRIOS
		numero ++;
		System.out.println(numero);*/ // o valor vai imprimir 6
		
		/*int numero = 5; // pos incremento ex 2
		int valor = 5 + numero ++;
		System.out.println (valor);// o valor vai imprimir 10*/
		
		/*int numero = 5; // pre incremento ex 3
		int valor = 5 + ++numero;
		System.out.println (valor);// o valor vai imprimir 11*/
		
		/*int numero = 5; // decremento ex 4
		int valor = 5 + numero --;
		System.out.println (valor);// o valor vai imprimir 10
		System.out.println(numero);// o valor vai imprimir 4*/
		
		/*int x = 4; //OPERADORES DE ATRIBUIÇÃO
		x += 2; // x = x + 2
		System.out.println(x);// o valor vai imrimir 6*/
		
		/*float v= 8.9f; //CLASS MATH ARREDONDAMENTO P/BAIXO
		int ar = (int)Math.floor(v);
		System.out.println(ar); // O valor vai imprimir 8 (arredondou p/baixo)*/
		
		/*float v= 8.9f; //CLASS MATH ARREDONDAMENTOS P/CIMA
		int ar = (int)Math.ceil(v);
		System.out.println(ar); // O valor vai imprimir 9 (arredondou p/cima)*/
		
		/*double aleatorio = Math.random(); //Gerador de numeros
		System.out.println(aleatorio);*/
		
		double aleatorio = Math.random(); //Gerador de numeros
		int n =(int) (5 + aleatorio * (10 -5)); // vai imprimir valores aleatorios entre 5 e 10
		System.out.println(n);
	}

}
