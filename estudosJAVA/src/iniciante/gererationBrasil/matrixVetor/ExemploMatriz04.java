package iniciante.gererationBrasil.matrixVetor;

import java.util.Scanner;

public class ExemploMatriz04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		
		System.out.print(" Digite as quatros notas do Aluno: \n");
		
		for(int contador = 0; contador < 4; contador++) {
			
			System.out.println("Digite a nota de numero " + (contador + 1) + ": ");
			notas[contador] = leia.nextDouble();
			
			soma += notas[contador];
			
		}
		
		media = soma / notas.length;
		System.out.println("A m�dia �: " + media);
	}

}
