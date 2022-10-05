package intermediario.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    //Linguagem desenvolvido que utiliza metodo caractere
    public static void main(String[] args) {


        // ********* EXPRESSÃO REGULARES

        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Todos os espacos em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z A-Z, digitos
        // \W = Tudo que não for incluso no \w
        // [] = Range

        String regex = "[a-zA-Z]";
        String texto = "cafeBASE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Index: 01234567");
        System.out.println("Texto: " + texto);
        System.out.print("Matcher: ");

        while (matcher.find()){
            System.out.print(matcher.group());
        }


        System.out.println();
        System.out.println("Numero exadecimal: " + 0x59F86A);


    }
}

