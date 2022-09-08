package iniciante.gererationBrasil.exercicios;
/*
 * 3-Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto

 */
import java.util.Scanner;

public class GenerationJava03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.print("Sua categoria � INFANTIL");
		} else if (idade >= 15 && idade <= 17) {
			System.out.print("Sua categoria � JUVENIL");
		} else if (idade >= 18 && idade <= 25) {
			System.out.print("Sua categoria � ADULTO");
		} else {
			System.out.print("Idade invalida");
		}
		leia.close();
	}
}