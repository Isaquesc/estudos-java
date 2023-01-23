package intermediario.aulaTemporal;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataAlura {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate copaQuatar = LocalDate.of(2022, Month.NOVEMBER, 21);

        Period periodo = Period.between(hoje, copaQuatar);

        System.out.println(copaQuatar.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(periodo.getDays() + " Dias " + periodo.getMonths() + " Meses para inicio da COPA DO MUNDO 2022 QUATAR");

    }
}
