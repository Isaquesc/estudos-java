package iniciante.gererationBrasil.exercicios;

//1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.


import java.util.Scanner;

public class GenerationJava01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int um, dois, tres, maior;
		
		System.out.print("Digite um valor: ");
		um = leia.nextInt();
		System.out.print("Digite um valor: ");
		dois = leia.nextInt();
		System.out.print("Digite um valor: ");
		tres = leia.nextInt();
		leia.close();
		
		if(um > dois && um > tres) {
			maior = um;
		} else if (dois > um && dois > tres) {
			maior = dois;
		} else if (tres > um && tres > dois) {
			maior = tres;
		} else {
			System.out.println("os numeros s�o todos iguais");
			return;
		}		
		System.out.println("O maior numero � digital foi: " + maior);
		
	}

}