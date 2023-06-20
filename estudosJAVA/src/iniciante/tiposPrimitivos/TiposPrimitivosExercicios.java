package iniciante.tiposPrimitivos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String[] dados = {"Isaque Costa", "Avenida Doutor José Artur da Nova"};
        Double salario = 4.576D;
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Eu " + dados[0] + ", morando no endereço " + dados[1] +
                "\n, confirmo que recebi o salario de R$" + salario + ", em " + formatador.format(data));



        ;
    }
}
