package iniciante.tiposPrimitivos;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual a distância que você deseja percorrer: ");

        int distancia = leitura.nextInt();

        if(distancia <= 200)
            System.out.println("Preço: " + 200*0.50);
        else
            System.out.println("Preço: " + 200*0.45);

    }
}
