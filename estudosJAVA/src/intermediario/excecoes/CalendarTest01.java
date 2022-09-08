package intermediario.excecoes;


import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static java.util.Calendar.getInstance;

public class CalendarTest01 {

    public static void main(String[] args) {

        //System.out.println(getInstance().getTime());

        Calendar calendar = getInstance();
        calendar.getTimeZone().setID("America/Rio_de_Janeiro");

        System.out.println(calendar);
;


    }
}
