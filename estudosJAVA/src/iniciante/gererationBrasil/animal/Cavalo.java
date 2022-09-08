package iniciante.gererationBrasil.animal;

public class Cavalo extends DadosAnimal implements Animal {

	@Override
	public void som() {
		System.out.println("Som: Relincha");
	}

	@Override
	public void correr() {
		System.out.println("Personalidade: Corre rapido");
	}

	@Override
	public void ambiente() {
		System.out.println("Ambiente: Domestico/Selvagem");
	}

	@Override
	public void nome() {
		setNome("CavaloDog");
		System.out.println("Nome: " + getNome());
	}

	@Override
	public void idade() {
		setIdade(22);
		System.out.println("Idade: " + getIdade());
	}
	
	public void CavaloDog() {
		nome();
		idade();
		ambiente();
		correr();
		som();
	}

}
