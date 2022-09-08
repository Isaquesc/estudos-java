package iniciante.gererationBrasil.lacos;

import java.util.Scanner;

/*Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/

public class GenerationLacos03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor = 0, maior = 0;
		
		while(idade != -99 ){
			
			System.out.print("Qual a sua idade? ");
			idade = leia.nextInt();
			
		
			if(idade < 21) {
				
				menor++;
				
			} else if(idade > 50) {
				
				maior++;
			}
			
		} //while
		
		leia.close();
		System.out.println("Total de pessoas com menos de 21 anos: " + menor);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior);
		System.out.println("FIM DO PROGRAMA");
		
	}//main
}
