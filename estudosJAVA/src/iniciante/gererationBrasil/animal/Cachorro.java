package iniciante.gererationBrasil.animal;

public class Cachorro extends DadosAnimal implements Animal{

	@Override
	public void som() {
		System.out.println("Som: Latido");
	}

	@Override
	public void correr() {
		System.out.println("Personalidade: Corre rapido");		
	}

	@Override
	public void ambiente() {
		System.out.println("Ambiente: Domestico");
	}
	
	@Override
	public void nome() {
		setNome("HotDog");
		System.out.println("Nome: " + getNome());
	}
	
	@Override
	public void idade() {
		setIdade(12);
		System.out.println("Idade: " + getIdade());
	}
	
	public void hotDog() {
		nome();
		idade();
		ambiente();
		correr();
		som();
	}

}
