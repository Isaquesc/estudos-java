package iniciante.javaIOdevDojo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\file.txt");
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("Estou no modo foco total (academia, estudos, noiva, casa)");
            bufferedWriter.newLine();
            bufferedWriter.write("pulando linha com bufferedWriter");
            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
