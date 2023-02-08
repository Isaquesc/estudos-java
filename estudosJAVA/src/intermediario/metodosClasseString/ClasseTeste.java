package intermediario.metodosClasseString;

public class ClasseTeste {
    public static void main(String[] args) {

//        Metodo Substring
        String stringSubstring = "Desenvolvimento Java";
        System.out.println(stringSubstring.substring(16)); // resultado: Java
        System.out.println(stringSubstring.substring(3,16));// resultado: envolvimento

//        Metodo Split
        String stringSplit = "Cursos_online_de_desenvolvimento_de_software";
        String[] split = stringSplit.split("_");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : split) {
            stringBuilder.append(s).append(" ");
        }
        System.out.println(stringBuilder);// resultado: Cursos online de desenvolvimento de software

//        Metodo ReplaceAll
        String stringReplaceAll = "Desenvolvimento Java";
        System.out.println(stringReplaceAll.replaceAll("Java", "de software")); // Resultado: Desenvolvimento de software

//        Metodo Equals
        String stringEqualsUm = "João";
        String stringEqualsDois = "joão";
        System.out.println(stringEqualsUm.equalsIgnoreCase(stringEqualsDois)); // Resultado: true

//        Metodo Trim
        String stringTrim = "       Espaços em Branco ";
        System.out.println(stringTrim.trim());
    }
}
