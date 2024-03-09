package intermediario.threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Usuarios {
    private final Queue<String> listaEmail = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int tamanhoListaEmail() {
        synchronized (listaEmail) {
            return listaEmail.size();
        }
    }

    public void adicionarEmailLista(String email) {
        synchronized (this.listaEmail) {
            System.out.println(Thread.currentThread().getName() + " adicionou um email na lista");
            this.listaEmail.add(email);
            this.listaEmail.notifyAll();
        }
    }

    public String verificarExisteEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " esta verificando se existe e-mail para enviar");
        synchronized (this.listaEmail) {
            while (this.listaEmail.isEmpty()) {
                if (!open)
                    return null;

                System.out.println(Thread.currentThread().getName() + " verificou que não existe email disponivel para ser enviado");
                this.listaEmail.wait();
            }
            return this.listaEmail.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (listaEmail) {
            System.out.println(Thread.currentThread().getName() + " encerrando o envio de email (notificando a todos)");
        }
    }

}
