package iniciante.interfaces;

public class Cachorro  implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("SOM CACHORRO: Latido");
		
	}

	@Override
	public void dormir() {
		System.out.println("MODO DORMI: ZZZZZZZZZZZ");
		
	}

}
