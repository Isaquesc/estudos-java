package intermediario.threads.test;

import intermediario.threads.dominio.Usuarios;
import intermediario.threads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {

    public static void main(String[] args) {
        Usuarios members = new Usuarios();
        Thread isaque = new Thread(new EmailDeliveryService(members), "Isaque");
        Thread elias = new Thread(new EmailDeliveryService(members), "Elias");

        isaque.start();
        elias.start();

        while(true){
            String email = JOptionPane.showInputDialog("Digite um endereco de e-mail");

            if (email == null || email.isEmpty()){
                members.close();
                break;
            }

            members.adicionarEmailLista(email);
        }

    }
}
