package iniciante.gererationBrasil.animal;

public class Preguica extends DadosAnimal implements Animal {

	@Override
	public void som() {
		System.out.println("Som: Tava com muita pregui�a pra emitir som");
	}

	@Override
	public void correr() {
		System.out.println("Personalidade: S� dorme ZzZzZzzZZzz");	
	}

	@Override
	public void ambiente() {
		System.out.println("Ambiente: Domestico");
	}

	@Override
	public void idade() {
		setIdade(10);
		System.out.println("Idade: " + getIdade());
	}

	@Override
	public void nome() {
		setNome("Segunda-Feira");
		System.out.println("Nome: " + getNome());
	}
	
	public void segundaFeira() {
		nome();
		idade();
		ambiente();
		correr();
		som();
	}

}
