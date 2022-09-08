package intermediario.collections.gerenation;

public class TestaErro {

	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da Exception!");
		
		try {
		
		vetor[4] = 1;
		System.out.println("Ap�s a Exception!");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception consertada!");
		}
	}

}
