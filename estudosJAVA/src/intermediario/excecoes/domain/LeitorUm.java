package intermediario.excecoes.domain;

import java.io.Closeable;
import java.io.IOException;

public class LeitorUm implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("fechando Leitor Um");
    }
}
