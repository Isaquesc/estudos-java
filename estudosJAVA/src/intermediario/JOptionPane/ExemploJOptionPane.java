package intermediario.JOptionPane;

import javax.swing.*;
import java.util.Objects;

public class ExemploJOptionPane {
    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        ImageIcon imageIcon = new ImageIcon(ExemploJOptionPane.class.getResource("pensive.png"));

        JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
        JOptionPane.showMessageDialog(null, "E-mail não informado","Atenção",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Favor informado o CPF","ERRO",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem teste de icone","AlgaWorks",JOptionPane.INFORMATION_MESSAGE, imageIcon);

    }
}
