package intermediario.concorrencia;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {

    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked())
                System.out.println(Thread.currentThread().getName() + " obteve o WRITE Lock");

            map.put(key, value);
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys() {
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(lock);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if (lock.isWriteLocked()) {
                System.out.println("WHITE LOCK");
            }
            lock.readLock().lock();
            System.out.println("FINALLY I GOT THE DAWM LOCK");

            try {
                System.out.println(Thread.currentThread().getName() + mapReadWrite.allKeys());
            } finally {
                lock.readLock().unlock();
            }
        };

        Thread t1 = new Thread(writer, "LEITURA");
        Thread t2 = new Thread(reader, "ESCRITA UM");
        Thread t3 = new Thread(reader, "ESCRITA DOIS");

        t1.start();
        t2.start();
        t3.start();

    }
}
