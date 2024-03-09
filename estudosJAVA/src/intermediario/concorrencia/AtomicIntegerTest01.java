package intermediario.concorrencia;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Contador {
    private int contador;
    private final AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);

    public void adicionar() {
        try {
            lock.lock();
            this.contador++;
            this.atomicInteger.incrementAndGet();
        } finally {
            lock.unlock();
        }
    }

    public int getContador() {
        return contador;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {

        Contador contador = new Contador();

        Runnable r = () -> {
            for (int i = 0; i < 10_000; i++) {
                contador.adicionar();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(contador.getContador());
        System.out.println(contador.getAtomicInteger());


    }
}
