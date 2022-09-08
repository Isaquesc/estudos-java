package iniciante.tiposPrimitivos;

public class ArraysMultidimensionais {

    public static void main(String[] args) {

        int[][] anoCompleto = new int[3][1];

        anoCompleto[0][0] = 31;
        anoCompleto[1][0] = 28;
        anoCompleto[2][0] = 30;


//        for (int i = 0; i < anoCompleto.length; i++) {
//            for (int j = 0; j < anoCompleto[i].length; j++) {
//                if (i == 0) {
//                    System.out.println("Janeiro tem " + anoCompleto[i][j] + " dias");
//                } else if (i == 1) {
//                    System.out.println("Fevereiro tem " + anoCompleto[i][j] + " dias");
//                } else if (i == 2) {
//                    System.out.println("Março tem " + anoCompleto[i][j] + " dias");
//                }
//            }
//        }

        for (int[] arrayAnoCompleto: anoCompleto) {
            for (int dias: arrayAnoCompleto) {
                System.out.println(dias);
            }
        }
    }
}
