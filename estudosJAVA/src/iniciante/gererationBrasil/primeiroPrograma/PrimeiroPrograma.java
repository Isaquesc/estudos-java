package iniciante.gererationBrasil.primeiroPrograma;

import java.util.Scanner;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.print("Escreva um valor: ");
		a = ler.nextInt();
		
		System.out.print("Escreva outro valor: ");
		
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.println("--------------------------");
		System.out.println(a + " + " + b + " = " + soma);
		System.out.println("--------------------------");
		System.out.println("teste");
		ler.close();
		
	
	}

}
