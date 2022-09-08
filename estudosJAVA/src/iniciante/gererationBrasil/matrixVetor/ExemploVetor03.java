package iniciante.gererationBrasil.matrixVetor;

public class ExemploVetor03 {
	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		double tempDia005 = 33.1;
		
		double [] temperaturas = new double[10];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 3 �: " + temperaturas[2]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for(int contador = 0; contador < temperaturas.length; contador ++) {
			System.out.println("O valor da temperatura do dia " + (contador+1) + " �: " + temperaturas[contador]);
		}
	}
}
