package exercicios;

public class Exercicio2 {

	public static void main(String[] args) {
		String impar, par;
		int cont = 2;

		    impar = "incomodam";
		    par = ", incomodam";
		   
		    System.out.println("1 elefante incomoda muita gente");
		    par+=par;
		    while(cont <= 3){
		    if (cont %2==0){
		        System.out.println(cont+" elefantes "+par+" muito mais");
		        par+=par;
		        cont++;
		    }
		    if (cont %2!=0){
		        System.out.println(cont+" elefantes "+impar+" muita gente!");
		        cont++;
		    }        
		    }
		}    
		

	}


