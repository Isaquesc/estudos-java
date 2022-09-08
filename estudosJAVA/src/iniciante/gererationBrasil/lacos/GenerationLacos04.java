package iniciante.gererationBrasil.lacos;

import java.util.Scanner;

/* EX04 */

public class GenerationLacos04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 0, idade,calma = 0, OutrosCalmo = 0, Calma18 = 0, MulheresNervosas = 0, Nervosos40 = 0, HomensAgressivos = 0;
		char sexo, personalidade; 
		
		while(contador < 150) {
			
			System.out.println("Qual a sua idade? ");
			idade = leia.nextInt();
			
			System.out.println("Qual o seu sexo? ");
			System.out.println("[1] - FEMININO");
			System.out.println("[2] - MASCULINO");
			System.out.println("[3] - OUTROS");
			sexo = leia.next().charAt(0);
			
			System.out.println("Qual a sua personalidade ? ");
			System.out.println("[1] - CALMO");
			System.out.println("[2] - NERVOSO");
			System.out.println("[3] - AGRESSIVO");
			personalidade = leia.next().charAt(0);
			
			contador ++;
			
			if(personalidade == '1'){
				calma++;
				
				if(sexo == '3') {
					OutrosCalmo++;
				}
				
				if(idade < 18) {
					Calma18++;
				}
			} if(personalidade == '2') {
				if(sexo == '1') {
					MulheresNervosas++;
				}
				
				if(idade > 40) {
					Nervosos40++;
				}
			} if(sexo == '2' && personalidade == '3') {
				HomensAgressivos++;
				
			}
			
		}
		
		System.out.println("Numero de pessoas calmas: " + calma);
		System.out.println("Numero de mulheres nervosas: " + MulheresNervosas);
		System.out.println("Numero de homens agressivos: " + HomensAgressivos);
		System.out.println("Numero de outros calmo: "+ OutrosCalmo);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: " + Nervosos40);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: " + Calma18);
		
	}

}
