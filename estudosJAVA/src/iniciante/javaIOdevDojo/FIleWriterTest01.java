package iniciante.javaIOdevDojo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\file.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("Atualmente estou no dima 1, afundado");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
