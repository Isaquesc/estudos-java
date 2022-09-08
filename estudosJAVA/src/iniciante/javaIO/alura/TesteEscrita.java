package iniciante.javaIO.alura;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        OutputStream escrita = new FileOutputStream("testeJavaIo2.txt"); // criando um arquivo com os byts escritos
        Writer wt = new OutputStreamWriter(escrita); // transformando arrays de string escritos em byts
        BufferedWriter bw = new BufferedWriter(wt); // Seperando caracteres escritos
        bw.write("Isaque mlk doido do Java! sise 2021"); //escrevendo
        bw.close(); //fechando metodo
    }

}
