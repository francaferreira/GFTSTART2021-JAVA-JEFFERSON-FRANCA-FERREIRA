package gftstart2021;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a;
	int b;
	int c;
	int maior;
	int menor;
			
	System.out.println("Digite o primeiro n�mero: " );
	a = input.nextInt();
	System.out.println("Didite o segundo n�mero: ");
	b = input.nextInt();
	System.out.println("Digite o terceiro n�mero: ");
	c = input.nextInt();
	
	maior = a;
	menor = a;
	
	if (b > maior) {
		maior = b;
	}
	
	if (c > maior) {
		maior = c;
	}
	System.out.printf("O Maior n� eh %d\n ", maior);
	
	if(b < menor) {
		menor = b;
	}
	if (c < menor) {
		menor = c ;
	}
	
	System.out.printf("O Menor n� eh %d\n ", menor);
				
	
	if (a == b){
		b = c;
	}
	System.out.println("Os tr�s n�mero s�o iguais:  ");
	}
}
