package iniciante.gererationBrasil.exercicios;

import java.util.Objects;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        int age, sex, categoria, manMob, womanFull, womanFront, back;
        String end = "s";
        back = 0;
        womanFront = 0;
        manMob = 0;
        womanFull = 0;

        Scanner read = new Scanner(System.in);

        while (end.equalsIgnoreCase("s")) {

            System.out.print("Digite a Idade: ");
            age = read.nextInt();

            System.out.println("Digite o seu Sexo");
            System.out.print("1-Masculino");
            System.out.print(" 2-Feminino");
            System.out.println(" 3-Outros");
            sex = read.nextInt();

            System.out.println("Categoria: ");
            System.out.print("1-Backend ");
            System.out.print("2-Frontend ");
            System.out.print("3-Mobile ");
            System.out.println("4-FullStack ");
            categoria = read.nextInt();


            if (categoria == 1) {
                back++;
            } else if (sex == 2 && categoria == 2) {
                womanFront++;
            } else if (sex == 1 && age >= 40 && categoria == 3) {
                manMob++;
            } else if (age <= 30 && sex == 2 && categoria == 4) {
                womanFull++;
            }

            System.out.println("\nDeseja continuar: (S/N)");
            end = read.next();
        }

        System.out.printf("Total de pessoas desenvolvedoras Backend: %d \n", back);
        System.out.printf("Total de mulheres desenvolvedoras Frontend: %d \n", womanFront);
        System.out.printf("Total de homens desenvolvedores Mobile maiores de 40 anos: %d \n", manMob);
        System.out.printf("Total de mulheres desenvolvedoras FullStack menores de 30 anos: %d \n", womanFull);
    }
}

