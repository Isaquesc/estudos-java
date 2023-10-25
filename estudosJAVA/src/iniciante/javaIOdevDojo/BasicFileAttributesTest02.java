package iniciante.javaIOdevDojo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest02 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo", "file.txt");
        Files.createFile(path);

        //fazendo a leitura do arquivo (apenas LER)
        BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println(readAttributes.creationTime());
        System.out.println(readAttributes.lastAccessTime());
        System.out.println(readAttributes.lastModifiedTime());

        //pegando o arquivo para conseguir alterar informações
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);





        Files.deleteIfExists(path);
    }
}
