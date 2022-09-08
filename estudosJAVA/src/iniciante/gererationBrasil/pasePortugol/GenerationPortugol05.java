package iniciante.gererationBrasil.pasePortugol;

import java.util.Scanner;

public class GenerationPortugol05 {
	
	public static void main(String[] args) {
		
		int n1, n2, n3, p1, p2, p3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("----- PROGRAMA MEDIA PONDERADA ------");
		System.out.print("Insira o valor da primeira nota: ");
		n1 = leia.nextInt();
		
		System.out.print("Insira o peso da primeira nota: ");
		p1 = leia.nextInt();
				
		System.out.print("Insira o valor da segunda nota: ");
		n2 = leia.nextInt();
		
		System.out.print("Insira o peso da primeira nota: ");
		p2 = leia.nextInt();
		
		System.out.print("Insira o valor da terceira nota: ");
		n3 = leia.nextInt();
		
		System.out.print("Insira o peso da primeira nota: ");
		p3 = leia.nextInt();
		
		media = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		System.out.println("A media �: " + media);
		
		leia.close();
	
	}

}