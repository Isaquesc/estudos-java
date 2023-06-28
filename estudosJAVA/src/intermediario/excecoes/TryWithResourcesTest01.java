package intermediario.excecoes;

import intermediario.excecoes.domain.LeitorDois;
import intermediario.excecoes.domain.LeitorUm;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {

        try (LeitorUm leitorUm = new LeitorUm();
             LeitorDois leitorDois = new LeitorDois()){

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
