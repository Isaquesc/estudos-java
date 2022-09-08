package iniciante.gererationBrasil.lacos;

import java.util.Scanner;

public class GenerationLacos06 {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int numero, quantidade = 0, soma = 0, media;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0){
				
				soma += numero;
				quantidade++;
				
			}
			
		}while(numero != 0);
		
		media = soma/quantidade;
		System.out.println("A media entre os numero digitados � de: " + media);
		
		
	}

}
