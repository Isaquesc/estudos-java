package iniciante.javaIO.alura;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        /**
         * PADRÃO DE PROJETO DECORATOR
         */

        InputStream leitura = new FileInputStream("testeJavaIo.txt"); //Fluxo de Entrada com Arquivo
        Reader isr = new InputStreamReader(leitura); //Transformando bits em caracteres
        BufferedReader br = new BufferedReader(isr); //Juntando os caracteres e formando uma linha
        String linha = br.readLine();

        //enquanto houver conteudo, o readLine irá continuar lendo linha por linha.
        if(br.ready()) {
            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } else {
            System.out.println("O Arquivo ainda nao esta pronto para ser lido");
        }
        br.close();

    }

}
