package fundamentos;

public class PrimitivoVsObjeto {

public static void main(String[]args) {
	
	String S = new String ("texto");
	S.toUpperCase();
	
	//Wrappers são versão objeto dos tipos 
	//primitivos
	int a = 123;
	System.out.println(a);
}
}