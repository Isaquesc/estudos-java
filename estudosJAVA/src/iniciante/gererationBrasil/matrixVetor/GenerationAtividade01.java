package iniciante.gererationBrasil.matrixVetor;

public class GenerationAtividade01 {
	public static void main(String[] args) {
		
		
		int A [] = new int [6]; int simples;
		
		
		//ATRIBUINDO VALORES: 1,0,5,-2,-5,7.
		
		A [0] =  1;
		A [1] =  0;
		A [2] =  5;
		A [3] = -2;
		A [4] = -5;
		A [5] =  7;
		
		/*ARMAZENANDO NA VARIAVEL SIMPLES A SOMA ENTRE OS VALORES 
		 *DAS POSICOES A[0], A[1] e A[5]
		 */
		
		simples = A[0] + A[1] + A[5];
		
		//MODIFICANDO O VETOR DA POSICAO [4], ATRIBUINDO O VALOR 100.
		
		A[4] = 100;
		
		//MOTRANDO NA TELA CADA VALOR DO VETOR
		
		for(int contador = 0; contador < A.length; contador++) {
				System.out.printf("\n A [%d] = %d", contador, A[contador]);
		}
		
	}

}
