package intermediario.concorrencia;

import java.util.concurrent.locks.ReentrantLock;

class Trabalhador implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Trabalhador(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf("Thread %s entrou em uma sessão crítica%n", name);
            System.out.printf("%d Threads esperando na fila%n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s%n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera%n", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

}

public class ReentrantLockTest01 {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        new Thread(new Trabalhador("A", lock)).start();
        new Thread(new Trabalhador("B", lock)).start();
        new Thread(new Trabalhador("C", lock)).start();
        new Thread(new Trabalhador("D", lock)).start();
        new Thread(new Trabalhador("E", lock)).start();

    }
}
