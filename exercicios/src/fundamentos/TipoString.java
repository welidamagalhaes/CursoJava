package fundamentos;

public class TipoString {

public static void main (String[] args) {
	System.out.println("Olá pessoal".charAt(2));
	
	String s= "Boa tarde";
	System.out.println(s.concat("!!!"));
	System.out.println (s +"!!!");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	System.out.println(s.toUpperCase().endsWith("TARDE"));
	System.out.println(s.length());
	System.out.println(s.equals("boa tarde"));
	System.out.println(s.toLowerCase().equals("boa tarde"));
	
	var nome ="PEDRO";
	var sobrenome = "Santos";
	var idade = 33;
	var salario= 12345.987;
	
	System.out.println("Nome: "+ nome + "\nSobrenome: "
	         + sobrenome +"\nSalario: "+ salario);
}

}
