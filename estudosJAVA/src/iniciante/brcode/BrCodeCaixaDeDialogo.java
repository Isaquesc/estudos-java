package iniciante.brcode;

import javax.swing.JOptionPane;

public class BrCodeCaixaDeDialogo {

	public static void main(String[] args) {
		
		String nome;
		int idade [] = new int [2];
		
		nome = JOptionPane.showInputDialog("Qual � seu nome?"); //lendo
		//JOptionPane.showMessageDialog(null,"Seja bem vindo " + nome); // mostrando
		
		idade [1] = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem? ")); 
		//JOptionPane.showMessageDialog(null,"Voce tem " + idade + " de idade"); // mostrando
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
		
		JOptionPane.showMessageDialog(null,"Ol� " + nome + " hoje voc� tem " + idade[1] + " anos, com " + height + " de altura");
		
		
	}

}
