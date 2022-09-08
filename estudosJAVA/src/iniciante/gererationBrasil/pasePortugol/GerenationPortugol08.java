package iniciante.gererationBrasil.pasePortugol;

import java.util.Scanner;

public class GerenationPortugol08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double fabrica, distribuidor, consumidor;
		
		System.out.println("Entre com o custo de fabrica: ");
		fabrica = leia.nextDouble();
		
		distribuidor = fabrica + (fabrica*0.28); // custo Fabrica + porcentagem  distribuidor
		consumidor = distribuidor + (distribuidor*0.45); // 	custo distribuidor + impostos
				
		System.out.println("Custo do consumidor: " + consumidor);
		
		leia.close();
		
		
		
	}
	
}
