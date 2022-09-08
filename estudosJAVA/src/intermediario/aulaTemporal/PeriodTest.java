package intermediario.aulaTemporal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static java.time.format.DateTimeFormatter.ofPattern;

public class PeriodTest {

    public static void main(String[] args) {

        /*
        LocalDate hoje = LocalDate.now();
        LocalDate hojeDoisAnosFrente = LocalDate.now().plusYears(2);
        System.out.println(Period.between(hoje, hojeDoisAnosFrente)); // P2Y
        */

        Integer assinatura = 13;

        LocalDate proximaCobrança = LocalDate.now().plusMonths(assinatura);
        Long tempoAssinatura = ChronoUnit.MONTHS.between(LocalDate.now(), proximaCobrança);

        String expira = "Expira em " + proximaCobrança.format(ofPattern("dd/MM/yyyy"));


        if (tempoAssinatura == 1) {
            System.out.println(expira + " - (" + tempoAssinatura + " mês de assinatura)");
        } else if(tempoAssinatura > 12 ) {
            System.out.println(expira + " - (1 ano e " + (tempoAssinatura - 12) + " mêses de assinatura)");
        } else {
            System.out.println(expira + " - (" + tempoAssinatura + " mêses de assinatura)");

        }

        System.out.println("Proxima cobrança " + LocalDate.now().plusMonths(1).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}
