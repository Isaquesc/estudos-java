package intermediario.collections.gerenation;

import java.util.ArrayList;
import java.util.Collections;

public class TetaCollections {

	public static void main(String[] args) {
		
		String aula1 = "Logica de Programa��o";
		String aula2 = "Java I";
		String aula3 = "Projeto Final";
		String aula4 = "SpringBoot";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		Collections.shuffle(aulas);
		System.out.println(aulas);
		//aulas.remove(0);
		//System.out.println(aulas);
		
		//Foreach --> especializado
		
		/*for(String i: aulas) {
			System.out.println(i);
		}*/
		//String primeiraAula = aulas.get(2);
		//System.out.println(aulas.get(2));
		
		/*for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		System.out.println(aulas.size());*/

	}

}
