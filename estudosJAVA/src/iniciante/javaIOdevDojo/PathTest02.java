package iniciante.javaIOdevDojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

    public static void main(String[] args) throws IOException {

        //CRIANDO UM DIRETORIO
        Path pastaPath = Paths.get("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\pasta");
        if (Files.notExists(pastaPath)) {
            Path directory = Files.createDirectory(pastaPath);
        }

        //CRIANDO UM DIRETORIO COM SUBPASTAS
        Path subPastaPath = Paths.get("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\pasta\\subPasta\\subPasta1");
        Path subPastaDirectories = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaDirectories.toString(), "arquivoSubPasta.txt");

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createDirectories(filePath);
        }

        //RENOMEANDO UM ARQUIVO
        Path source = filePath;
        Path target = Paths.get(source.getParent().toString(), "arquivo_renamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

    
    }
}
