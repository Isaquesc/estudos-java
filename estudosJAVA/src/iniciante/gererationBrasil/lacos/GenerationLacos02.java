package iniciante.gererationBrasil.lacos;

import java.util.Scanner;

public class GenerationLacos02 {
	

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
	int par = 0 , impar = 0, numero;
	
	for(int contador = 0; contador < 9; contador++) {
		
		System.out.println("Digite um numero");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
				par++;
		} else {
			impar++;
		}
	  }
	
		leia.close();
		System.out.println("Numeros pares: " + par);
		System.out.println("Numeros impares: " + impar);
   }
}
