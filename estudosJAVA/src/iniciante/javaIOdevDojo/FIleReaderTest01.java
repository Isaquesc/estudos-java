package iniciante.javaIOdevDojo;

import java.io.*;

public class FIleReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\file.txt");
        try (FileReader fileReader = new FileReader(file)) {

            int leitura;

            while ((leitura = fileReader.read()) != -1 )
                System.out.print((char)leitura);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
