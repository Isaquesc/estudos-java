package iniciante.gererationBrasil.pasePortugol;

import java.util.Scanner;

public class GerenationPortugol06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double x1, y1, x2, y2, potencia1, pontecia2, soma1;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o valor de x: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		leia.close();
		
		potencia1 = Math.pow((x2 - x1),2);
		pontecia2 = Math.pow((y2 - y1),2);
		soma1 = Math.sqrt((potencia1 + pontecia2));
		
		System.out.println("O valor � igual a: " + soma1);
		
		
	}
}
