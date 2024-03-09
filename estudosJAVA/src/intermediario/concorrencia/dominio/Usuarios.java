package intermediario.concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Usuarios {
    private final Queue<String> listaEmail = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private ReentrantLock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();

    public boolean isOpen() {
        return open;
    }

    public int tamanhoListaEmail() {
        lock.lock();
        try {
            return listaEmail.size();
        } finally {
            lock.unlock();
        }
    }

    public void adicionarEmailLista(String email) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " adicionou um email na lista");
            this.listaEmail.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String verificarExisteEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " esta verificando se existe e-mail para enviar");
        lock.lock();
        try {
            while (this.listaEmail.isEmpty()) {
                if (!open)
                    return null;

                System.out.println(Thread.currentThread().getName() + " verificou que NAO existe email disponivel para ser enviado");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " verificou que EXISTE email disponivel para ser enviado");
            return this.listaEmail.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " encerrando o envio de email (notificando a todos)");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

}
