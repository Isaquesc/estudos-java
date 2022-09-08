package iniciante.gererationBrasil.matrixVetor;

import javax.swing.JOptionPane;

public class GenerationAtividade02 {
	
	public static void main(String[] args) {
				
		int numero [] = new int [6];
		int QuantidadePar = 0, QuantidadeImpares = 0, SomaPar = 0, SomaImpar = 0;
		
		
		//LENDO OS 6 NUMEROS e SELECIONANDO QUANTIDADE DE PARES E IMPARES
		for(int contador = 0; contador < numero.length; contador++) {
				
		numero [contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
						
				//System.out.print("Digite um numero: ");
				//numero[contador] = leia.nextInt();
				
				
				//SOMANDO A QUANTIDADE DE NUMERO IMPARES E PARES
				if(numero[contador]%2 == 0) {
					QuantidadePar += numero[contador]; 
				} else {
					QuantidadeImpares += numero[contador];
				}
		} // for
		
		
		//MOSTRANDO A QUANTIDADE DE NUMERO IMPARES E PARES
		JOptionPane.showMessageDialog(null, "A soma dos numeros impares �: " + QuantidadeImpares + "\n");
		JOptionPane.showMessageDialog(null, "A soma dos numeros pares �: " + QuantidadePar + "\n");
		
		//System.out.printf("A soma dos numero impares �: %d", QuantidadeImpares);8
		//System.out.printf("\nA soma dos numero pares �: %d", somaPar);
		
		
		//MOSTRANDO NUMERO PARES
			System.out.print("\nNumero pares digitado: ");
		for(int contador = 0; contador < numero.length; contador++) {
			if(numero[contador]%2 == 0) {
				//System.out.printf("%d, ", numero[contador]);
			}
		} //for
		
		//MOSTRANDO NUMERO IMPARES
			System.out.print("\nNumeros impares digitado: ");
		for(int contador = 0; contador < numero.length; contador++) {
			if(numero[contador]%2 != 0) {
				
				
				//System.out.printf("%d, ",numero[contador]);
			}
		} //for
		
		
		
	}
}
