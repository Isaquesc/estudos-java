package intermediario.aulaTemporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek diaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        if (diaSemana == DayOfWeek.FRIDAY){
            return temporal.plus(3,ChronoUnit.DAYS);
        } else if (diaSemana == DayOfWeek.SATURDAY){
            return temporal.plus(2,ChronoUnit.DAYS);
        } else{
            return  temporal.plus(1, ChronoUnit.DAYS);
        }

    }
}

public class TemporalAdjusterTest {
    public static void main(String[] args) {

        String proximoDiaUtil = LocalDate.now().with(new ProximoDiaUtil()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(proximoDiaUtil);

    }
}
