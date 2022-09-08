package iniciante.javaIO.alura;

import java.io.*;

public class LeituraEscrita {

    public static void main(String[] args) throws IOException {

//      PrintStream printStream = new PrintStream(new File("testeEscritaLeitura2.txt"));
        PrintWriter printWriter = new PrintWriter(new File("testeEscritaLeitura2.txt"));
        printWriter.println("Hello Word");
        printWriter.close();
    }
}
