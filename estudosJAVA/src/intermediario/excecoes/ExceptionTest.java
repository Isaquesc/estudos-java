package intermediario.excecoes;

import java.io.*;

public class ExceptionTest {

    public static void main(String[] args) {
         criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\arquivo.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Teste modulo exception");
            fileWriter.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
