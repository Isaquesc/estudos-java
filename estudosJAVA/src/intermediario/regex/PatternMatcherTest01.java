package intermediario.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

    //Linguagem desenvolvido que utiliza metodo caractere
    public static void main(String[] args) {


        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Todos os espacos em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos

        String regex = "\\S";
        String texto = "isaquedeco\t@hotmail.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Index: 0123456");
        System.out.println("Texto: " + texto);
        System.out.print("Matcher: ");

        while (matcher.find()){
            System.out.print(matcher.group());;
        }


    }
}

