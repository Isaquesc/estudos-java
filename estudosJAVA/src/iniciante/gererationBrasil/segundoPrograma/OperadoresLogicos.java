package iniciante.gererationBrasil.segundoPrograma;

import java.util.Scanner;

/**
 * @author isaqu
 *
 */
public class OperadoresLogicos 
{

	public static void main(String[] args) 
	{	
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		leia.close();
		
		if(idade <= 18) 
		{ 
			System.out.println("Voc� � de menor"); 
		} else 
			{ 
				System.out.println("Voc� � maior de idade"); 
			}
	}

}
