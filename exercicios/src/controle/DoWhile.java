package controle;
import java.util.Scanner;

public class DoWhile {
	public static void main (String[] args) {
		
		//if(...) sentença; ou {}
		// while(...) setença;ou {}
		// for (...;...;...) sentença;ou {}
		
		// do setença;ou {} whilw(...);
		Scanner entrada = new Scanner (System.in);
		
		String texto = "por favor";
		do {
			System.out.println("Você precisa falar"
					+ "\nas palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		}while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
		
		}
	}


