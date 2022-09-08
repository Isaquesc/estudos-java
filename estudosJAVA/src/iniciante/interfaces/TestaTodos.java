package iniciante.interfaces;

public class TestaTodos {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		cachorro.somAnimal();
		cachorro.dormir();
		
		gato.somAnimal();
		gato.dormir();
		
	}

}
