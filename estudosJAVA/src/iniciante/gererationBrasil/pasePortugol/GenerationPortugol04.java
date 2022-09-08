package iniciante.gererationBrasil.pasePortugol;

import java.util.Scanner;

public class GenerationPortugol04 {
	
	public static void main(String[] args) {
	
	int a,b,c,d,r,s;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite um valor: ");
	a = leia.nextInt(); 
	
	System.out.print("Digite um valor: ");
	b = leia.nextInt(); 
	
	System.out.print("Digite um valor: ");
	c = leia.nextInt(); 
	
		if(a > 0 && b > 0 && c > 0) 
		{
		
			r = (a + b) * 2;
			s = (b + c) * 2;
			d = (r + s) / 2;
			
			System.out.println("O valor � de: " + d);
	
		} else 
			{
				
				System.out.println("Escreva somente valores possitivos");
			
			}
		
		leia.close();
	}
	
}