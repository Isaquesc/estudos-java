package iniciante.gererationBrasil.exercicios;
/*
 * 4-Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero 
 * � par ou �mpar. Se for par exiba tamb�m a raiz quadrada 
 * do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */
import java.util.*;

public class GenerationJava04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);


		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Esse numero � par");
			System.out.println("Sua raiz quadrada �: " + Math.sqrt(numero));
		} else {
			System.out.println("Esse numero � impar");
			System.out.println("Seu numero elevado a ele mesmo �: " + Math.pow(numero,2));
		}
		
		leia.close();
	}

}
