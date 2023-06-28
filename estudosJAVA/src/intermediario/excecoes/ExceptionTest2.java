package intermediario.excecoes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ExceptionTest2 {

    public static void main(String[] args) throws IOException{
         criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\arquivo.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Teste modulo exception");
            fileWriter.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
