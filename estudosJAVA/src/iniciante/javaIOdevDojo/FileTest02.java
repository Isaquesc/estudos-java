package iniciante.javaIOdevDojo;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        //criando um diretorio
        File pasta = new File("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\pasta");
        System.out.println("pasta criada? - " + pasta.mkdir());

        //criando um arquivo com um objeto de diretorio
        File file = new File(pasta, "arquivo.txt");
        file.createNewFile();
        System.out.println("arquivo.txt criado? - " + file.exists());

        //renomeando um arquivo
        boolean b = file.renameTo(new File(pasta, "arquivoRenomeado.txt"));
        System.out.println("arquivo.txt renomeado? - " + b);

        //renomeando uma pasta
        boolean pastaRenomeada = pasta.renameTo(new File("C:\\Users\\iscosta2\\Documents\\ProjetosPessoais\\estudosJAVA\\estudosJAVA\\arquivo\\pastaRenomeada"));
        System.out.println("pasta renomeada? - " + pastaRenomeada);
    }

}
