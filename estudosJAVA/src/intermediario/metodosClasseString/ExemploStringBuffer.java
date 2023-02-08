package intermediario.metodosClasseString;

public class ExemploStringBuffer {
    public static void main(String[] args) {

//        StringBuffer sb = new StringBuffer(); // thread-safe usar no contexto de concorrencia
        StringBuilder sb = new StringBuilder(); // não-thread-safe - mais rapido

        sb.append("Bem vindo ao curso de Java.").append(" ");
        sb.append("Fique a vontade para tirar suas duvidas.").append(" ");
        sb.append("Estamos aqui para te ajudar.");

        sb.insert(26, " *TESTE*");
        System.out.println(sb.toString());

    }
}
