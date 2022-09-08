package iniciante.gererationBrasil.exercicios;

//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

import java.util.Scanner;

public class GenerationJava02 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c, menor1, menor2, menor3;

		System.out.println("Digite tr�s numeros: ");

		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		leia.close();

		menor1 = a;

		if (menor1 >= b) {
			menor2 = menor1;
			menor1 = b;
		} else {
			menor2 = b;
		}

		if (c >= menor2) {
			menor3 = c;
		} else 
		{
			menor3 = menor2;
			menor2 = c;
		}
		if (menor2 < menor1) {
			menor2 = menor1;
			menor1 = c;
		}

		System.out.println("A ordem crescente �: " + menor1 + " - " + menor2 + " - " + menor3);

	}

}