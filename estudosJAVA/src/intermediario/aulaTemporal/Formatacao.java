package intermediario.aulaTemporal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import static java.time.format.DateTimeFormatter.ofPattern;

public abstract class Formatacao {

    public static String formatarSimpleDateFormat(String dataRecebida) throws ParseException {

        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm")
                .parse(dataRecebida);

        return new SimpleDateFormat("dd/MMMM/yyyy").format(date);
    }

    public static String formatarDateTimeFormatter(String dataRecebida) {

        LocalDateTime dataFormatada = LocalDateTime
                .parse(dataRecebida, ofPattern("yyyy-MM-dd HH:mm:ss"));

        return dataFormatada.format(ofPattern("dd/MMMM/yyyy"));
    }
}
