package intermediario.jOptionPane;

import javax.swing.*;

public class RecebendoInformacoes {

    public static void main(String[] args) {

        int confirmação = JOptionPane.showOptionDialog(null,
                "Você gostaria de terminal o seu cadastro?",
                "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"sim", "não", "sim, com e-mail"},
                1
        );

        System.out.print("Cliente selecionou: ");

        if (confirmação == 0) {
            System.out.println("sim");
        } else if (confirmação == 1 ) {
            System.out.println("não");
        } else {
            System.out.println("sim, com e-mail");
        }

    }
}
