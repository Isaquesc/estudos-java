package iniciante.javaIO.alura;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        // criando um arquivo com os byts escritos
        OutputStream escrita = new FileOutputStream("testeJavaIo2.txt");

        // transformando arrays de string escritos em byts
        Writer wt = new OutputStreamWriter(escrita);

        // Seperando caracteres escritos
        BufferedWriter bw = new BufferedWriter(wt);

        //escrevendo
        bw.write("Isaque mlk doido do Java! sise 2021");
        bw.close(); //fechando metodo
    }

}
