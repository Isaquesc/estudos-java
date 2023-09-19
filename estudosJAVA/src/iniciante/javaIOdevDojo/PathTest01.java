package iniciante.javaIOdevDojo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {

        String nomeArquivo = "arquivoRenomeado.txt";

        Path path = Paths.get("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\pastaRenomeada", nomeArquivo);
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getFileName());

    }
}
