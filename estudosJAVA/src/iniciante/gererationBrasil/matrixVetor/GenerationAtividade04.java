package iniciante.gererationBrasil.matrixVetor;

import java.util.*;
import javax.swing.*;

public class GenerationAtividade04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random();

		double primeira[][] = new double[2][2];
		double segunda[][] = new double[2][2];
		double terceiro[][] = new double[2][2];
		char escolha = 0;
		int constante = 0;

		System.out.println("Digite a PRIMEIRA matrix: ");
		for (int l = 0; l < primeira.length; l++) {
			for (int c = 0; c < primeira.length; c++) {
				primeira[l][c] = leia.nextDouble();

			}
		}

		System.out.println();
		System.out.println("Digite a SEGUNDA matrix: ");
		for (int l = 0; l < segunda.length; l++) {
			for (int c = 0; c < segunda.length; c++) {
				segunda[l][c] = leia.nextDouble();
			}
		}

		while (escolha != '5') {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("\n------------MENU----------");
			System.out.println("[1] SOME AS DUAS MATRIZES");
			System.out.println("[2] SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA");
			System.out.println("[3] ADICIONAR UMA CONSTANTE AS DUAS MATRIZES");
			System.out.println("[4] IMPRIMIR AS MATRIZES");
			System.out.println("[5] SAIR");
			escolha = leia.next().charAt(0);

			switch (escolha) {

			/* SOMANDO DUAS MATRIZES */
			case '1':
				System.out.println("====== MATRIX 01 =====");
				for (int l = 0; l < primeira.length; l++) {
					for (int c = 0; c < primeira.length; c++) {
						terceiro[l][c] = primeira[l][c] + segunda[l][c];
						System.out.print(terceiro[l][c] + " | ");

					} // for
				} // for
				break;

			/* SUBTRAINDO A PRIMEIRA COM A SEGUNDA MATRIX */
			case '2':
				System.out.println("====== MATRIX 02 =====");
				for (int l = 0; l < primeira.length; l++) {
					for (int c = 0; c < primeira.length; c++) {
						terceiro[l][c] = primeira[l][c] - segunda[l][c];
						System.out.print(terceiro[l][c] + " | ");

					} // for
				} // for
				break;

			// ADICIONANDO UMA CONSTANTE A MATRIX
			case '3':
				System.out.println("Qual constante deseja adicionar a matrix ?");
				constante = leia.nextInt();

				System.out.println("====== MATRIX 01 =====");
				for (int l = 0; l < primeira.length; l++) {
					for (int c = 0; c < primeira.length; c++) {
						primeira[l][c] += constante;
						System.out.print(primeira[l][c] + " | ");
					} // for
				} // for

				System.out.println("\n====== MATRIX 02 =====");
				for (int l = 0; l < segunda.length; l++) {
					for (int c = 0; c < segunda.length; c++) {
						segunda[l][c] += constante;
						System.out.print(segunda[l][c] + " | ");
					} // for
				} // for
				break;

			// IMPRIMINDO AS MATRIZES
			case '4':
				System.out.println("====== MATRIX 01 =====");
				for (int l = 0; l < primeira.length; l++) {
					for (int c = 0; c < primeira.length; c++) {
						System.out.print(primeira[l][c] + " | ");
					}
				}

				System.out.println("\n====== MATRIX 02 =====");
				for (int l = 0; l < segunda.length; l++) {
					for (int c = 0; c < segunda.length; c++) {
						System.out.print(segunda[l][c] + " | ");
					}
				}
				break;

			// IMPRIMINDO FIM DO PROGRAMA
			case '5':
				
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Tem Certeza disso?")); 
				JOptionPane.showMessageDialog(null,"OK " + idade + " de idade");
				
				leia.close();
				break;

			default:
				System.out.println("OP��O INVALIDA");
			}// while
		} // switch
	}// main
}
