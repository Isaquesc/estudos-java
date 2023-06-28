package intermediario.excecoes.domain;

public class LeitorDois implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("fechando Leitor Dois");
    }
}
