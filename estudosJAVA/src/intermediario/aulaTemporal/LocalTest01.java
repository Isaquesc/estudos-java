package intermediario.aulaTemporal;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class LocalTest01 {

    public static void main(String[] args) {

        Locale locale = new Locale("PT", "BR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        Date time = Calendar.getInstance().getTime();

        System.out.println(dateFormat.format(time));
}}
