package intermediario.threads.test;

class ThreadExemple extends Thread {
    private char c;

    public ThreadExemple(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Inicio da thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.print(c);
            System.out.println();
        }
        System.out.println("FIM da thread: " + Thread.currentThread().getName());
    }
}

class ThreadExampleRunnable implements Runnable {

    private char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName() + "(INICIO) ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c);

        }

        System.out.print(Thread.currentThread().getName() + "(FIM) ");
    }
}

public class ThreadTest01 {
    public static void main(String[] args) throws InterruptedException {

//        ThreadExemple t1 = new ThreadExemple('A');
//        ThreadExemple t2 = new ThreadExemple('B');
//        ThreadExemple t3 = new ThreadExemple('C');
//        ThreadExemple t4 = new ThreadExemple('D');

        Thread t1 = new Thread(new ThreadExampleRunnable('A'), " T1 ");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), " T2 ");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), " T3 ");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), " T4 ");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
//        t3.start();
//        t4.start();

        System.out.println();
        System.out.println("############################ Main");

    }
}
