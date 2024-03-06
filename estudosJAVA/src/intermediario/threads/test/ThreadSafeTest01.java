package intermediario.threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (!names.isEmpty())
            System.out.print(Thread.currentThread().getName() + " " + "removeu: " + names.remove(0));
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Tom");

        Runnable r = threadSafeNames::removeFirst;

        new Thread(r, "primeira thread").start();
        new Thread(r, "segunda thread").start();
    }
}
