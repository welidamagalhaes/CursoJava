package abc;

public class Caneta02 {
       public String modelo;
       private float ponta;
       private String cor;
       
       public Caneta02() { //Este é o metodo construtor
           this.tampar();
           this.cor = "Azul";
      }
      
      private void tampar() {
		// TODO Auto-generated method stub
		
	}

	public String getModelo() {
   	   return this.modelo;
      }
      public void setModelo (String m ) {
   	   this.modelo = m;
      }
      public float getPonta() {
   	   return this.ponta;
      }
   	   public void setPonta (float p) {
   		   this.ponta = p;
      }
          public void status() {
       	   System.out.println("SOBRE A CANETA:");
       	   System.out.println("Modelo: " + this.modelo);
       	   System.out.println("Ponta: " + this.ponta);
       	   System.out.println("Cor:" + this.cor);
          }
          }
	
       



