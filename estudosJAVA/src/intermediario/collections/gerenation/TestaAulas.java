package intermediario.collections.gerenation;

import java.util.ArrayList;

public class TestaAulas {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("L�gica", 21);
		Aula a2 = new Aula("Java I", 88);
		Aula a3 = new Aula("SpringBoot", 150);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);

	}

}
