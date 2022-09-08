package intermediario.collections.gerenation;

public class TesteUnitario {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 4;
		
		int resultado = calc.somar(2, 2);
		
		if( resultado == resultadoEsperado) {
			System.out.println("Teste OK");
		}else {
			System.out.println("Teste Falhou!");
		}

	}

}
