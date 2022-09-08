package iniciante.gererationBrasil.animal;

public class TestaTodas {

	public static void main(String[] args) {
		
		DadosAnimal dados = new DadosAnimal();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
		dados.menu();
		preguica.segundaFeira();
		
		dados.menu();
		cachorro.hotDog();
		
		dados.menu();
		cavalo.CavaloDog();
		

	}

}


