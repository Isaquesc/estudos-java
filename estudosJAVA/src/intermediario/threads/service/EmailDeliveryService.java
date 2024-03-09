package intermediario.threads.service;

import intermediario.threads.dominio.Usuarios;

public class EmailDeliveryService implements Runnable {

    private final Usuarios members;

    public EmailDeliveryService(Usuarios members) {
        this.members = members;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " iniciando o envio de email");

        while (members.isOpen() || members.tamanhoListaEmail() > 0) {
            try {
                String email = members.verificarExisteEmail();

                if (email == null)
                    continue;

                System.out.println(Thread.currentThread().getName() + " esta enviando email para: " + email);
                Thread.sleep(200);

                System.out.println(Thread.currentThread().getName() + " enviou e-mail para: " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
