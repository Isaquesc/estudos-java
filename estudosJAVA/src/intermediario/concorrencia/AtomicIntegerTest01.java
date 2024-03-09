package intermediario.concorrencia;

import java.util.concurrent.atomic.AtomicInteger;

class Contador {
    private int contador;
    private AtomicInteger atomicInteger = new AtomicInteger();

    public void adicionar() {
        this.contador++;
        this.atomicInteger.incrementAndGet();
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
