package abc;

import java.util.Scanner;

/*public class TiposPrimitivos {
	public static void main (String[] args) {
		float nota = 8.5f;
		System.out.println("Minha nota é " + nota);
		
	}

}*/

/*public class TiposPrimitivos{
	public static void main(String[] args) {
		String nome = "Welida";
		float nota =8.5f;
				System.out.printf("A nota de %s é  %.2f",nome,nota);
		
	}
}*/
public class TiposPrimitivos { // exemplo de entrada de dados
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite o nome do aluno: ");
			String nome = teclado.nextLine();
			System.out.println("Digite a nota do aluno: ");
			float nota = teclado.nextFloat();
			System.out.printf("A nota do %s é %.1f"  , nome,nota);
		}
		
	
   }
	}
 
 


