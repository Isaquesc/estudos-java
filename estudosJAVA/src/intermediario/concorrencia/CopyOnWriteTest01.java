package intermediario.concorrencia;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable impressao = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                list.iterator()
                        .forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable remove = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName() + " removeu " + i);
                list.remove(i);
            }
        };

        new Thread(impressao).start();
        new Thread(remove).start();
    }
}
