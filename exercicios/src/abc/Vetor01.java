package abc;

import java.util.Arrays;

public class Vetor01 {
public static void main(String[] args) {
	/*String mes[]= {"Jan","Fev","Mar","Abr","Mai","Jun","Jul",
			        "Ago","Set","Out","Nov","Dez"};
	int tot[] = {31,29,31,30,31,31,30,31,30,31,30,31};
       for(int c=0; c<mes.length; c++) {
    	   System.out.println("O mês de  " + mes[c] + " tem " + tot[c] + " dias ao todo");
       }


}
}*/
	double v[] = {3.5,2.75,9, -4.5};
	for (double valor:v ) {
		Arrays.sort(v);
		
		System.out.print(valor + "");
	}
}
}