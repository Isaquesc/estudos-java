package intermediario.aulaTemporal;

import java.text.ParseException;

import static intermediario.aulaTemporal.Formatacao.*;

public class ConvertDateTest {

    public static void main(String[] args) throws ParseException {

        String data = formatarDateTimeFormatter("2022-08-25 21:00:00");

        System.out.println("Data formatada: " + data);

    }
}
