package iniciante.interfaces;

public class TestaCarroFerrariFusca {
	
	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari();
		
		
		ferrari.acelera();
		
		
		ferrari = new Fusca();
		ferrari.acelera();
		
	}

}
