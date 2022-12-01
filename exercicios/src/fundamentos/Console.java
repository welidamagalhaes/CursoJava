package fundamentos;

import java.util.Scanner;

public class Console {


public static void main (String[]args) {
	
	System.out.print("Bom");
	System.out.print("dia!\n\n");  // quebra de linha (dá espaço ex: Bom dia!)
	
	System.out.println("Bom");    //PRINT "LN" PULAR LINHA
	System.out.println("dia!");
	
	System.out.printf("Megasena: %d %d %d %d %d %d %n", //O % serve pra espaçamento entre os numeros e o %n pular a linha
			1,2,3,4,5,6);
	System.out.printf("Salario: %.1f%n",1234.5678);
	System.out.printf("Nome: %s%n","João");
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite seu nome: ");
	String nome =entrada.nextLine();
	
	System.out.println("Digite seu sobrenome: ");
	String sobrenome=entrada.nextLine();
	
	System.out.println("Digite sua idade: ");t  dade=entrada.nextLine();
	
}
}