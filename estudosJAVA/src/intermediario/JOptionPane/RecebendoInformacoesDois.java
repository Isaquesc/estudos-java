package intermediario.JOptionPane;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class RecebendoInformacoesDois {

    public static void main(String[] args) {

        Object sexo = showInputDialog(null,
                "Selecione o sexo",
                "AlgaWorks",
                QUESTION_MESSAGE,
                null,
                new Object[]{"Masculino", "Feminino"},
                1);

        System.out.println("Sexo: " + sexo);

        Object nome = showInputDialog(null,
                "Digite seu nome:",
                "AlgaWorks",
                QUESTION_MESSAGE,
                null,
                null,
                null);

        System.out.println("Nome: " + nome);
    }
}
