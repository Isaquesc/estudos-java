package intermediario.concorrencia;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        list.put("Isaque");
        System.out.println(Thread.currentThread().getName() + " adicionou o valor \"" + list.peek() + "\" a lista");

        System.out.println("tentando adicionar um novo valor");
        new Thread(new RemoveFromQueue(list), "T1").start();
        list.put("Silva");
        System.out.println(Thread.currentThread().getName() + " adicionou o valor \"" + list.peek() + "\" a lista");

    }
}

 class RemoveFromQueue implements Runnable {
    private final BlockingQueue list;

    public RemoveFromQueue(BlockingQueue list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " aguardando 5s ");
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName() + " removendo valor \"" + list.take() + "\" da lista");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
