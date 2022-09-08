package iniciante.gererationBrasil.pasePortugol;

import java.util.Scanner;

public class GerenationPortugol07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, j, f, x, y;
		
		System.out.println("Digite o valor A");
		a = leia.nextInt();
		
		System.out.println("Digite o valor B");
		b = leia.nextInt();
		
		System.out.println("Digite o valor C");
		c = leia.nextInt();
		
		System.out.println("Digite o valor D");
		d = leia.nextInt();
		
		System.out.println("Digite o valor J");
		j = leia.nextInt();
		
		System.out.println("Digite o valor F");
		f = leia.nextInt();		
		leia.close();
		
	
		x = ((c*j)-(b*f)/(a*j)-(b*d));
		y = ((a*f)-(c*d))/((a*j)-(b*d));
		
		System.out.println("O valor de x � " + x + " e y � " + y);
		

		
	}
	
}

