package iniciante.gererationBrasil.matrixVetor;

import java.util.*;

public class GenerationAtividade03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random();
		
		int A [][] = new int[3][3];
		int maior10 = 0;

		
		for(int L = 0; L < A.length; L++) {
			for(int C = 0; C < A.length; C++) {
				
				System.out.print("Digite um valor: ");
				A[L][C] = leia.nextInt();
				
				if(A[L][C] > 10) {
					maior10++;
				}

			}//SegundoFor
		}//PrimeiroFor
		
			System.out.printf("\nA quantidade de numero maiores que 10 dentro da matrix �: %d",maior10);

		
	}
}
