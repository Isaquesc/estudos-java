package intermediario.excecoes;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        System.out.println("Inicio do main");

        try {
            metodo1(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static int metodo1(int a, int b) throws RuntimeException{
        System.out.println("Inicio do metodo 1");

        if (b == 0) {
            throw new RuntimeException("Argumento ilegal, nao pode ser 0");
        }

        System.out.println("Fim do metodo 1");
        return a / b;
    }
}
