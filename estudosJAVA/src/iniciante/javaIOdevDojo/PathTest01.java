package iniciante.javaIOdevDojo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {

        String nomeArquivo = "arquivoRenomeado.txt";
        String root = "C:";
        String diretorio = "\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\pastaRenomeada" ;

        Path path = Paths.get(root,diretorio, nomeArquivo);
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getFileName());


    }
}
